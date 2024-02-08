package threads;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddPrinterTest {

    @Test
    void testEvenPrinter() {
        EvenOddPrinter.EvenPrinter evenPrinter = new EvenOddPrinter.EvenPrinter();
        // Run the even printer thread
        Thread evenThread = new Thread(evenPrinter);
        evenThread.start();
        // Add assertions or other mechanisms to verify the output
    }

    @Test
    void testOddPrinter() {
        EvenOddPrinter.OddPrinter oddPrinter = new EvenOddPrinter.OddPrinter();
        // Run the odd printer thread
        Thread oddThread = new Thread(oddPrinter);
        oddThread.start();
        // Add assertions or other mechanisms to verify the output
    }
}

