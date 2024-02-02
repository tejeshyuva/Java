package Collections;
import java.util.ArrayList;
class Student {
    String firstName;
    String lastName;
    double GPA;

    public Student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }
}

public class removeLowGPAStudents {


    public static ArrayList<Student> removeLowGPAStudents(ArrayList<Student> students) {
        double averageGPA=calculateAverageGPA(students);
        students.removeIf(student -> student.GPA < averageGPA);
        return students;
    }

    public static double calculateAverageGPA(ArrayList<Student> students) {
        if (students.isEmpty()) {
            return 0.0;
        }

        double totalGPA = 0;
        for (Student student : students) {
            totalGPA += student.GPA;
        }

        return totalGPA / students.size();
    }


}
