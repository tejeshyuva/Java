package streamsAndFilters;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CapitalizeAndSortStrings {

    public static String[] capitalizeAndSortStrings(String[] strings) {
        // Capitalize the first letter of each string, sort alphabetically, and return the result
        return Arrays.stream(strings)
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1))
                .sorted(Comparator.naturalOrder())
                .toArray(String[]::new);
    }
}


