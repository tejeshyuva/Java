package Collections;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class removeLowGPAStudentsTest {

    @Test
    public void testRemoveLowGPAStudents() {
        // Create an ArrayList of students for testing
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe", 3.5));
        studentList.add(new Student("Alice", "Smith", 2.8));
        studentList.add(new Student("Bob", "Johnson", 3.0));
        studentList.add(new Student("Eva", "Williams", 3.8));

        // Call the method to remove low GPA students
        ArrayList<Student> result = removeLowGPAStudents.removeLowGPAStudents(studentList);

        // Define the expected ArrayList after removal
        ArrayList<Student> expectedList = new ArrayList<>();

        expectedList.add(new Student("John", "Doe", 3.5));
        expectedList.add(new Student("Eva", "Williams", 3.8));


        // Compare the expected ArrayList with the result ArrayList
        expectedList.equals(result);
    }



    @Test
    public void testRemoveLowGPAStudentsForEmptyList(){
        ArrayList<Student> studentList = new ArrayList<>();


        // Call the method to remove low GPA students
        ArrayList<Student> result = removeLowGPAStudents.removeLowGPAStudents(studentList);
        // Define the expected ArrayList after removal
        ArrayList<Student> expectedList = new ArrayList<>();
        expectedList.equals(result);


    }

    @Test
    public void testCalculateAverageGPA() {
        // Create an ArrayList of students for testing
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe", 3.5));
        studentList.add(new Student("Alice", "Smith", 2.8));
        studentList.add(new Student("Bob", "Johnson", 3.0));
        studentList.add(new Student("Eva", "Williams", 3.8));

        // Call the method to calculate the average GPA
        double averageGPA = removeLowGPAStudents.calculateAverageGPA(studentList);

        // Define the expected average GPA
        double expectedAverageGPA = (3.5 + 2.8 + 3.0 + 3.8) / 4.0;

        // Compare the expected average GPA with the result
        assertEquals(expectedAverageGPA, averageGPA, 0.01); // Allowing a small tolerance for floating-point comparison
    }


}