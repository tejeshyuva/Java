package Strings;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CountVowelsTest {

    @Test
    public void testCountVowelsWithVowels() {
        assertEquals(6, CountVowels.countVowels("Sai Theja Kumar!"));
        assertEquals(3, CountVowels.countVowels("Hello World"));
        assertEquals(5, CountVowels.countVowels("Programming is fun"));
        assertEquals(4, CountVowels.countVowels("OpenAI"));
    }
    @Test
    public void testCountVowelsWithoutVowels() {
        assertEquals(0, CountVowels.countVowels("1234567890"));
        assertEquals(0, CountVowels.countVowels("!@#$%^&*()"));
        assertEquals(0, CountVowels.countVowels(""));
    }

    @Test
    public void testCountVowelsWithMixedCharacters() {
        assertEquals(2, CountVowels.countVowels("Th3 qu1ck br0wn fox"));
        assertEquals(5, CountVowels.countVowels("I love coding!"));
    }
}
