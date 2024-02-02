package Collections;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class ArrayListTraversalTest {
    // Test case for traversing an ArrayList using a traditional for loop
    @Test
    public void testTraversalWithForLoop() {
        // Arrange
        ArrayList<String> stringsList = new ArrayList<>();
        stringsList.add("Apple");
        stringsList.add("Banana");
        stringsList.add("Orange");

        // Act
        StringBuilder result = new StringBuilder();
        for (String s : stringsList) {
            result.append(s).append(" ");
        }

        // Assert
        assertEquals("Apple Banana Orange ", result.toString());
    }

    // Test case for traversing an ArrayList using an enhanced for loop (for-each loop)
    @Test
    public void testTraversalWithEnhancedForLoop() {
        // Arrange
        ArrayList<String> stringsList = new ArrayList<>();
        stringsList.add("Apple");
        stringsList.add("Banana");
        stringsList.add("Orange");

        // Act
        StringBuilder result = new StringBuilder();
        for (String fruit : stringsList) {
            result.append(fruit).append(" ");
        }

        // Assert
        assertEquals("Apple Banana Orange ", result.toString());
    }
}
