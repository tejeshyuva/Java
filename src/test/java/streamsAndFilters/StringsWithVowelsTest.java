package streamsAndFilters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringsWithVowelsTest {

    @Test
    public void testContainsVowels() {
        // Test with a string containing vowels
        String str1 = "apple";
        assertEquals(true, StringsWithVowels.containsVowels(str1));

        // Test with a string containing no vowels
        String str2 = "xyz";
        assertEquals(false, StringsWithVowels.containsVowels(str2));

        // Test with an empty string
        String str3 = "";
        assertEquals(false, StringsWithVowels.containsVowels(str3));
    }

    @Test
    public void testCountVowels() {
        // Test with a string containing vowels
        String str1 = "banana";
        assertEquals(3, StringsWithVowels.countVowels(str1));

        // Test with a string containing no vowels
        String str2 = "xyz";
        assertEquals(0, StringsWithVowels.countVowels(str2));

        // Test with an empty string
        String str3 = "";
        assertEquals(0, StringsWithVowels.countVowels(str3));
    }
}
