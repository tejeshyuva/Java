package exceptionHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\saith\\OneDrive\\Desktop\\class 1.txt"; // Provide the path to your file

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
