package additionalPrograms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ArrayListReverserTest {

    @Test
    public void testReverseWithIntegerArrayList() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayListReverser.reverse(list);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), list);
    }

    @Test
    public void testReverseWithStringArrayList() {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
        ArrayListReverser.reverse(list);
        assertEquals(Arrays.asList("orange", "banana", "apple"), list);
    }

    @Test
    public void testReverseWithEmptyArrayList() {
        ArrayList<Object> list = new ArrayList<>();
        ArrayListReverser.reverse(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void testReverseWithSingleElementArrayList() {
        ArrayList<Integer> list = new ArrayList<>(Collections.singletonList(42));
        ArrayListReverser.reverse(list);
        assertEquals(Collections.singletonList(42), list);
    }
    

    @Test
    public void testReverseWithNullArrayList() {
        ArrayList<Object> list = null;
        ArrayListReverser.reverse(null);
        assertNull(null);
    }
}
