package streamsAndFilters;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class MathOperationTest {
    @Test
    public void testAddition() {
        MathOperation addition = Integer::sum;

        // Test case 1: Positive numbers
        int result1 = addition.operate(5, 3);
        assertEquals(8, result1);

        // Test case 2: Negative numbers
        int result2 = addition.operate(-5, -3);
        assertEquals(-8, result2);

        // Test case 3: Zero and positive number
        int result3 = addition.operate(0, 10);
        assertEquals(10, result3);

        // Test case 4: Zero and negative number
        int result4 = addition.operate(0, -10);
        assertEquals(-10, result4);

        // Test case 5: Two zeros
        int result5 = addition.operate(0, 0);
        assertEquals(0, result5);
    }
}

