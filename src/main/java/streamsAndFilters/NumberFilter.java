package streamsAndFilters;

import java.util.List;
import java.util.stream.Collectors;

public class NumberFilter {

    public static List<Integer> filterAndDoubleEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .collect(Collectors.toList());
    }
}
