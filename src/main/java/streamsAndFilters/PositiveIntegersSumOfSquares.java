package streamsAndFilters;

import java.util.List;

public class PositiveIntegersSumOfSquares {

    public static int sumOfSquaresOfPositiveIntegers(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number > 0)
                .mapToInt(number -> number * number)
                .sum();
    }
}

