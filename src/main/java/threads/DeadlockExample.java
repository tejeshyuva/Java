package threads;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadlockExample {

    static class Worker implements Runnable {
        private final Lock lock1;
        private final Lock lock2;

        public Worker(Lock lock1, Lock lock2) {
            this.lock1 = lock1;
            this.lock2 = lock2;
        }

        @Override
        public void run() {
            // Acquire lock1
            lock1.lock();
            System.out.println(Thread.currentThread().getName() + " acquired lock1");

            // Sleep to simulate some work
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Try to acquire lock2
            lock2.lock();
            System.out.println(Thread.currentThread().getName() + " acquired lock2");

            // Release locks
            lock1.unlock();
            lock2.unlock();
        }
    }
}
