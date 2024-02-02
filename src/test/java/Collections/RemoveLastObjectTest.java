package Collections;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class RemoveLastObjectTest {

    @Test
    public void testRemoveLastObject() {
        // Arrange
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Act
        RemoveLastObject.removeLastObject(list);

        // Assert
        assertEquals(2, list.size());
        assertEquals("Apple", list.get(0));
        assertEquals("Banana", list.get(1));
    }

    @Test
    public void testRemoveLastObjectEmptyList() {
        // Arrange
        ArrayList<String> emptyList = new ArrayList<>();

        // Act
        RemoveLastObject.removeLastObject(emptyList);

        // Assert
        assertTrue(emptyList.isEmpty());
    }

    @Test
    public void testRemoveLastObjectSingleElementList() {
        // Arrange
        ArrayList<String> singleElementList = new ArrayList<>();
        singleElementList.add("Apple");

        // Act
        RemoveLastObject.removeLastObject(singleElementList);

        // Assert
        assertTrue(singleElementList.isEmpty());
    }
}

