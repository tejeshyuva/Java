package streamsAndFilters;

import java.util.Arrays;
import java.util.Comparator;
public class StringSorting {

    public static void printSortedStrings(String[] strings) {
        Arrays.sort(strings, (s1, s2) -> {
            // First, sort the strings based on their lengths in ascending order
            int result = Integer.compare(s1.length(), s2.length());
            if (result != 0) {
                return result;
            }
            // If two strings have the same length, sort them in descending order based on their last characters
            return Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1));
        });

        // Print the sorted array for verification
        System.out.println(Arrays.toString(strings));
    }
}
