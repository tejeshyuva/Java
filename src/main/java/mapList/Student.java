package mapList;
// Define the package as per your project structure
public class Student {
    private String firstName;
    private String lastName;
    private int id;

    // Constructor
    public Student(String firstName, String lastName, double id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = (int) id;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
