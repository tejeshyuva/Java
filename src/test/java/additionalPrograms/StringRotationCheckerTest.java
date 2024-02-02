package additionalPrograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringRotationCheckerTest {

    @Test
    public void testIsRotationWithRotation() {
        String str1 = "abcd";
        String str2 = "cdab";
        assertTrue(StringRotationChecker.isRotation(str1, str2));
    }

    @Test
    public void testIsRotationWithNonRotation() {
        String str1 = "abcd";
        String str2 = "bcda";
        assertTrue(StringRotationChecker.isRotation(str1, str2));
    }

    @Test
    public void testIsRotationWithNullStrings() {
        String str1 = null;
        String str2 = null;
        assertFalse(StringRotationChecker.isRotation(str1, str2));
    }

    @Test
    public void testIsRotationWithDifferentLengthStrings() {
        String str1 = "abcd";
        String str2 = "abc";
        assertFalse(StringRotationChecker.isRotation(str1, str2));
    }

    @Test
    public void testIsRotationWithEmptyStrings() {
        String str1 = "";
        String str2 = "";
        assertTrue(StringRotationChecker.isRotation(str1, str2));
    }
}
