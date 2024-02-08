package threads;

public class EvenOddPrinter {

    static class EvenPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 60; i += 2) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(100); // Sleep for 100 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class OddPrinter implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 59; i += 2) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(100); // Sleep for 100 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

