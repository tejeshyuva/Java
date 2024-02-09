package streamsAndFilters;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathOperationTest {

    @Test
    void testAddition() {
        // Given
        MathOperation addition = (a, b) -> a + b;

        // When
        int result = addition.operate(5, 3);

        // Then
        assertEquals(8, result, "Addition test failed");
    }

    // Add more test cases for other math operations here

}
