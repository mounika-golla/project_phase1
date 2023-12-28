package phase1_project;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 6; i++) {
            System.out.println("Thread 1: Count - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        for (int i = 1; i <= 6; i++) {
            System.out.println("Main Thread: Count - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


