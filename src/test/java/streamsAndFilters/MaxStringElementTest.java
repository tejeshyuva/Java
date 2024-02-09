package streamsAndFilters;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxStringElementTest {

    @Test
    public void testFindMaxString() {
        List<String> strings = List.of("apple", "Banana", "grape", "Orange", "kiwi");
        Optional<String> expectedMaxString = Optional.of("Orange");

        Optional<String> actualMaxString = MaxStringElement.findMaxString(strings);

        assertEquals(expectedMaxString, actualMaxString);
    }

    @Test
    public void testFindMaxStringWithEmptyList() {
        List<String> strings = List.of();
        Optional<String> expectedMaxString = Optional.empty();

        Optional<String> actualMaxString = MaxStringElement.findMaxString(strings);

        assertEquals(expectedMaxString, actualMaxString);
    }
}
