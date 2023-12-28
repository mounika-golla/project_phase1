package phase1_project;

class SharedResource {
    private boolean flag = false;

    public synchronized void printNumbers() {
        for (int i = 0; i <= 4; i++) {
            while (!isFlag()) {
                try {
                    wait(); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + ": " + i);
            setFlag(false);
            notify(); 
        }
    }

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}

class NumberPrinter implements Runnable {
    private SharedResource sharedResource;
    private boolean isEven;

    public NumberPrinter(SharedResource sharedResource, boolean isEven) {
        this.sharedResource = sharedResource;
        this.isEven = isEven;
    }

    @Override
    public void run() {
        if (isEven) {
            sharedResource.printNumbers();
        } else {
            synchronized (sharedResource) {
                for (int i = 2; i <= 10; i += 2) {
                    while (sharedResource.isFlag()) {
                        try {
                            sharedResource.wait(); 
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                    sharedResource.setFlag(true);
                    sharedResource.notify(); 
                }
            }
        }
    }
}

public class SleepWait {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread oddThread = new Thread(new NumberPrinter(sharedResource, false), "OddThread");
        Thread evenThread = new Thread(new NumberPrinter(sharedResource, true), "EvenThread");

        oddThread.start();
        evenThread.start();
    }
}
