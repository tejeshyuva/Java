package StaticExample;

public class StaticExample {
    // Static variable of type int
    private static int staticVariable = 0;

    // Static method that returns the static variable
    public static int getStaticVariable() {
        return staticVariable;
    }

    public static void main(String[] args) {
        // Accessing the static variable
        int variableValue = StaticExample.staticVariable;
        System.out.println("Static Variable Value: " + variableValue);  // Output: 0

        // Accessing the static method
        int result = StaticExample.getStaticVariable();
        System.out.println("Result from Static Method: " + result);  // Output: 0

        // Modifying the static variable using the class name
        StaticExample.staticVariable = 42;

        // Accessing the static variable using an instance (not recommended for static variables)
        StaticExample instance = new StaticExample();
        System.out.println("Static Variable Value after Modification: " + staticVariable);  // Output: 42
    }
}
