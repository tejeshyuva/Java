package additionalPrograms;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

public class UniqueWordCounterTest {

    @Test
    public void testCountUniqueWords() {
        String str = "hello world hello world hello";
        HashMap<String, Integer> expectedWordCountMap = new HashMap<>();
        expectedWordCountMap.put("hello", 3);
        expectedWordCountMap.put("world", 2);

        assertEquals(expectedWordCountMap, UniqueWordCounter.countUniqueWords(str));
    }

    @Test
    public void testCountUniqueWordsWithEmptyString() {
        String str = "";
        HashMap<String, Integer> expectedWordCountMap = new HashMap<>();

        assertEquals(expectedWordCountMap, UniqueWordCounter.countUniqueWords(str));
    }

    @Test
    public void testCountUniqueWordsWithNullString() {
        String str = null;
        HashMap<String, Integer> expectedWordCountMap = new HashMap<>();

        assertEquals(expectedWordCountMap, UniqueWordCounter.countUniqueWords(str));
    }
}
