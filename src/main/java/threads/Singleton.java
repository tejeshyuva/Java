package threads;

public class Singleton {

    // Private static instance variable
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {}

    // Public static method to get the singleton instance
    public static Singleton getInstance() {
        // Lazy initialization
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method of the singleton class
    public String showMessage() {
        return "Hello, I am a singleton!";
    }
}
