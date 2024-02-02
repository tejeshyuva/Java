package Strings;



import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class AnagramCheckTest {

    @Test
    public void testAreAnagramsForAnagrams() {
        assertTrue(AnagramCheck.areAnagrams("listen", "silent"));
        assertTrue(AnagramCheck.areAnagrams("Astronomer", "Moon starer"));
        assertTrue(AnagramCheck.areAnagrams("debit card", "bad credit"));
        assertTrue(AnagramCheck.areAnagrams("The Morse Code", "Here come dots"));
        assertTrue(AnagramCheck.areAnagrams("School master", "The classroom"));
    }

    @Test
    public void testAreAnagramsForNonAnagrams() {
        assertFalse(AnagramCheck.areAnagrams("hello", "world"));
        assertFalse(AnagramCheck.areAnagrams("test", "text"));
        assertFalse(AnagramCheck.areAnagrams("java", "python"));
        assertFalse(AnagramCheck.areAnagrams("programming", "algorithm"));
    }

    @Test
    public void testAreAnagramsForEmptyStrings() {
        assertTrue(AnagramCheck.areAnagrams("", ""));
    }

    @Test
    public void testAreAnagramsForDifferentLengthStrings() {
        assertFalse(AnagramCheck.areAnagrams("abcd", "abc"));
    }

    @Test
    public void testAreAnagramsForCaseInsensitivity() {
        assertTrue(AnagramCheck.areAnagrams("Listen", "Silent"));
        assertTrue(AnagramCheck.areAnagrams("Tea", "Eat"));
    }
}
