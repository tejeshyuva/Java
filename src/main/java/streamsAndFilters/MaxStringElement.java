package streamsAndFilters;

import java.util.List;
import java.util.Optional;

public class MaxStringElement {

    public static Optional<String> findMaxString(List<String> strings) {
        return strings.stream()
                .max(String::compareToIgnoreCase);
    }
}
