package streamsAndFilters;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringFilterTest {

    @Test
    public void testFilterStringsStartingWithA() {
        List<String> strings = List.of("Apple", "Banana", "Orange", "Avocado", "Grapes");
        List<String> expectedFilteredStrings = List.of("Apple", "Avocado");

        List<String> filteredStrings = StringFilter.filterStringsStartingWithA(strings, s -> s.startsWith("A"));

        assertEquals(expectedFilteredStrings, filteredStrings);
    }

    @Test
    public void testFilterStringsStartingWithAEmptyList() {
        List<String> strings = List.of();
        List<String> expectedFilteredStrings = List.of();

        List<String> filteredStrings = StringFilter.filterStringsStartingWithA(strings, s -> s.startsWith("A"));

        assertEquals(expectedFilteredStrings, filteredStrings);
    }

    @Test
    public void testFilterStringsStartingWithANoMatches() {
        List<String> strings = List.of("Banana", "Orange", "Grapes");
        List<String> expectedFilteredStrings = List.of();

        List<String> filteredStrings = StringFilter.filterStringsStartingWithA(strings, s -> s.startsWith("A"));

        assertEquals(expectedFilteredStrings, filteredStrings);
    }
}
