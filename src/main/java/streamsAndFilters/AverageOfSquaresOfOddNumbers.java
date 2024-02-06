package streamsAndFilters;

public class AverageOfSquaresOfOddNumbers {
    public static double calculateAverage(Integer[] numbers) {
        double sum = 0;
        int count = 0;
        for (int num : numbers) {
            if (num % 2 != 0) { // Check if the number is odd
                sum += num * num; // Square the odd number and add to sum
                count++;
            }
        }

        return count > 0 ? sum / count : 0; // Calculate average if there are odd numbers
    }

}
