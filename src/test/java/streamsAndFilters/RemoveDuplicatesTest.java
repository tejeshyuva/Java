package streamsAndFilters;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicates() {
        List<Integer> numbersWithDuplicates = List.of(1, 2, 3, 4, 2, 5, 3, 6);
        List<Integer> expectedUniqueNumbers = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> actualUniqueNumbers = RemoveDuplicates.removeDuplicates(numbersWithDuplicates);

        assertEquals(expectedUniqueNumbers, actualUniqueNumbers);
    }

    @Test
    public void testRemoveDuplicatesWithEmptyList() {
        List<Integer> emptyList = List.of();
        List<Integer> expectedEmptyList = List.of();

        List<Integer> actualUniqueNumbers = RemoveDuplicates.removeDuplicates(emptyList);

        assertEquals(expectedEmptyList, actualUniqueNumbers);
    }
}
