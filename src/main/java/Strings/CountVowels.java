package Strings;

public class CountVowels {

    // Function to count the number of vowels in a given string
    static int countVowels(String inputString) {
        inputString = inputString.toLowerCase();
        int vowelCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            // Check if the current character is a vowel
            char currentChar = inputString.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}
