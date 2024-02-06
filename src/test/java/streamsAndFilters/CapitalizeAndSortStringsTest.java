package streamsAndFilters;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class CapitalizeAndSortStringsTest {

    @Test
    void testCapitalizeAndSortStrings() {
        String[] inputStrings = {"apple", "banana", "orange", "grape", "kiwi"};
        String[] expectedOutput = {"Apple", "Banana", "Grape", "Kiwi", "Orange"};

        // Call the method to be tested
        String[] result = Arrays.stream(inputStrings)
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                .sorted()
                .toArray(String[]::new);

        // Assert the expected output with the actual result
        assertArrayEquals(expectedOutput, result);
    }
}
