package phase1_project;

class Counter {
    private int count = 0;

    // Synchronized method
    public synchronized void increment() {
        count++;
    }

    // Synchronized block
    public void decrement() {
        synchronized (this) {
            count--;
        }
    }

    public int getCount() {
        return count;
    }
}

class Synchronization {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Thread 1 increments the counter 1000 times
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Thread 2 decrements the counter 1000 times
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final count
        System.out.println("Final Count: " + counter.getCount());
    }
}
