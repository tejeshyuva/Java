package streamsAndFilters;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberFilterTest {

    @Test
    public void testFilterAndDoubleEvenNumbers() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expectedFilteredAndDoubledNumbers = List.of(4, 8, 12, 16, 20);

        List<Integer> filteredAndDoubledNumbers = NumberFilter.filterAndDoubleEvenNumbers(numbers);

        assertEquals(expectedFilteredAndDoubledNumbers, filteredAndDoubledNumbers);
    }

    @Test
    public void testFilterAndDoubleEvenNumbersNoEvenNumbers() {
        List<Integer> numbers = List.of(1, 3, 5, 7, 9);
        List<Integer> expectedFilteredAndDoubledNumbers = List.of();

        List<Integer> filteredAndDoubledNumbers = NumberFilter.filterAndDoubleEvenNumbers(numbers);

        assertEquals(expectedFilteredAndDoubledNumbers, filteredAndDoubledNumbers);
    }

    @Test
    public void testFilterAndDoubleEvenNumbersEmptyList() {
        List<Integer> numbers = List.of();
        List<Integer> expectedFilteredAndDoubledNumbers = List.of();

        List<Integer> filteredAndDoubledNumbers = NumberFilter.filterAndDoubleEvenNumbers(numbers);

        assertEquals(expectedFilteredAndDoubledNumbers, filteredAndDoubledNumbers);
    }
}

