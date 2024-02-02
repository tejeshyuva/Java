public class PrintPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // Print '+' characters
            for (int j = 0; j < rows - i; j++) {
                System.out.print("+");
            }

            // Print '-' characters
            for (int k = 0; k < i; k++) {
                System.out.print("-");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
