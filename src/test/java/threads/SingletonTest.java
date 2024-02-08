package threads;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    public void testGetInstance() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Check if both instances are the same
        assertSame(instance1, instance2);
    }

    @Test
    public void testShowMessage() {
        Singleton instance = Singleton.getInstance();

        // Call the showMessage method and check if it works
        assertEquals("Hello, I am a singleton!", instance.showMessage());
    }
}
