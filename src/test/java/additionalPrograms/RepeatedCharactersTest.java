package additionalPrograms;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RepeatedCharactersTest {

    @Test
    public void testPrintRepeatedCharacters() {
        String str = "hello world";
        String expectedOutput = "Repeated characters in the string:\n" +
                "l\n" +
                "o";
        assertEquals(expectedOutput, getPrintedOutput(str));
    }

    private String getPrintedOutput(String str) {
        StringBuilder repeatedCharacters = new StringBuilder("Repeated characters in the string:\n");

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            // Check if the character is already counted
            boolean isCounted = false;
            for (int j = 0; j < i; j++) {
                if (charArray[j] == currentChar) {
                    isCounted = true;
                    break;
                }
            }
            // If not counted, count occurrences
            if (!isCounted) {
                int count = 1;
                for (int k = i + 1; k < charArray.length; k++) {
                    if (charArray[k] == currentChar) {
                        count++;
                    }
                }
                if (count > 1) {
                    repeatedCharacters.append(currentChar).append("\n");
                }
            }
        }
        return repeatedCharacters.toString();
    }
}
