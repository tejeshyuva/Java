package streamsAndFilters;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositiveIntegersSumOfSquaresTest {

    @Test
    public void testSumOfSquaresOfPositiveIntegers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int expectedSumOfSquares = 1 + 4 + 9 + 16 + 25;

        int actualSumOfSquares = PositiveIntegersSumOfSquares.sumOfSquaresOfPositiveIntegers(numbers);

        assertEquals(expectedSumOfSquares, actualSumOfSquares);
    }

    @Test
    public void testSumOfSquaresOfPositiveIntegersWithNegativeNumbers() {
        List<Integer> numbers = List.of(-1, 2, -3, 4, -5);
        int expectedSumOfSquares = 4 + 16;

        int actualSumOfSquares = PositiveIntegersSumOfSquares.sumOfSquaresOfPositiveIntegers(numbers);

        assertEquals(expectedSumOfSquares, actualSumOfSquares);
    }

    @Test
    public void testSumOfSquaresOfPositiveIntegersWithEmptyList() {
        List<Integer> numbers = List.of();
        int expectedSumOfSquares = 0;

        int actualSumOfSquares = PositiveIntegersSumOfSquares.sumOfSquaresOfPositiveIntegers(numbers);

        assertEquals(expectedSumOfSquares, actualSumOfSquares);
    }
}

