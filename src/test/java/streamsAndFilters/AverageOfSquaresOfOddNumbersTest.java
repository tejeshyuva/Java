package streamsAndFilters;

import java.util.Arrays;

public class AverageOfSquaresOfOddNumbersTest {
    public static void main(String[] args) {
        // Test Case 1: Array with odd and even numbers
        Integer[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        testAverage(numbers1, 165.0);

        // Test Case 2: Array with only odd numbers
        Integer[] numbers2 = {1, 3, 5, 7, 9};
        testAverage(numbers2, 165.0);

        // Test Case 3: Array with only even numbers
        Integer[] numbers3 = {2, 4, 6, 8, 10};
        testAverage(numbers3, 0.0);

        // Test Case 4: Empty array
        Integer[] numbers4 = {};
        testAverage(numbers4, 0.0);
    }

    private static void testAverage(Integer[] numbers, double expected) {
        double actual = AverageOfSquaresOfOddNumbers.calculateAverage(numbers);
        System.out.println("Input: " + Arrays.toString(numbers));
        System.out.println("Expected Average: " + expected);
        System.out.println("Actual Average: " + actual);
        System.out.println("Test Passed: " + (actual == expected));
        System.out.println();
    }
}
