import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the value of N from the user
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        // Output: Display the Fibonacci series up to Nth term
        System.out.println("Fibonacci Series up to " + n + " terms:");
        printFibonacciSeries(n);

        // Close the scanner
        scanner.close();
    }

    // Function to print Fibonacci series up to Nth term
    private static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
