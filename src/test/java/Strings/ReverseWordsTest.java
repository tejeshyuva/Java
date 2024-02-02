package Strings;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReverseWordsTest {

    @Test
    public void testReverseWords() {
        assertEquals("avaJ EE2J esreveR eM", ReverseWords.reverseWords("Java J2EE Reverse Me"));
        assertEquals("olleH dlroW", ReverseWords.reverseWords("Hello World"));
        assertEquals("gnimmargorP si nuf", ReverseWords.reverseWords("Programming is fun"));
        assertEquals("IAnepO", ReverseWords.reverseWords("OpenAI"));
    }

    @Test
    public void testReverseWordsWithEmptyString() {
        assertEquals("", ReverseWords.reverseWords(""));
    }

    @Test
    public void testReverseWordsWithSingleWord() {
        assertEquals("fedcba", ReverseWords.reverseWords("abcdef"));
    }

    @Test
    public void testReverseString() {
        assertEquals("cba", ReverseWords.reverseString("abc"));
        assertEquals("edcba", ReverseWords.reverseString("abcde"));
        assertEquals("12321", ReverseWords.reverseString("12321"));
    }
}
