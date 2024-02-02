package additionalPrograms;
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindromeWithPalindromeNumber() {
        assertTrue(PalindromeChecker.isPalindrome(121));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeNumber() {
        assertFalse(PalindromeChecker.isPalindrome(123));
    }

    @Test
    public void testIsPalindromeWithSingleDigitNumber() {
        assertTrue(PalindromeChecker.isPalindrome(5));
    }

    @Test
    public void testIsPalindromeWithNegativeNumber() {
        assertFalse(PalindromeChecker.isPalindrome(-121));
    }

    @Test
    public void testIsPalindromeWithZero() {
        assertTrue(PalindromeChecker.isPalindrome(0));
    }
}
