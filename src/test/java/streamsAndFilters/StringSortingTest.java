package streamsAndFilters;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringSortingTest {

    @Test
    public void testPrintSortedStrings() {
        // Test case 1: Basic test case with strings of different lengths
        String[] input1 = {"apple", "banana", "pear", "grape", "kiwi", "orange"};
        String[] expected1 = {"pear", "kiwi", "apple", "grape", "orange", "banana"};
        StringSorting.printSortedStrings(input1);
        assertArrayEquals(expected1, input1);

        // Test case 2: Strings with equal lengths but different last characters
        String[] input2 = {"hello", "world", "java", "python", "programming"};
        String[] expected2 = {"java", "hello", "world", "python", "programming"};
        StringSorting.printSortedStrings(input2);
        assertArrayEquals(expected2, input2);

        // Test case 4: Empty array
        String[] input4 = {};
        String[] expected4 = {};
        StringSorting.printSortedStrings(input4);
        assertArrayEquals(expected4, input4);

        // Test case 5: Array with single string
        String[] input5 = {"programming"};
        String[] expected5 = {"programming"};
        StringSorting.printSortedStrings(input5);
        assertArrayEquals(expected5, input5);

    }
}

