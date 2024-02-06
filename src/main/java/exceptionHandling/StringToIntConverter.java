package exceptionHandling;

public class StringToIntConverter {

    public static int convertToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
            return -1; // Return a default value or throw the exception based on your requirement
        }
    }
}
