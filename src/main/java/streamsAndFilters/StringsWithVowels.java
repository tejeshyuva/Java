package streamsAndFilters;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringsWithVowels {

    // Method to check if a string contains vowels
    public static boolean containsVowels(String str) {
        return str.chars().anyMatch(ch -> "aeiouAEIOU".indexOf(ch) != -1);
    }

    // Method to count the number of vowels in a string
    public static long countVowels(String str) {
        return str.chars().filter(ch -> "aeiouAEIOU".indexOf(ch) != -1).count();
    }

    // Method to print strings containing vowels along with the number of vowels
    public static void printStringsWithVowels(String[] strings) {
        Arrays.stream(strings)
                .filter(StringsWithVowels::containsVowels)
                .forEach(str -> System.out.println("String: " + str + ", Number of vowels: " + countVowels(str)));
    }
}
