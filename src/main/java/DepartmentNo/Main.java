package DepartmentNo;

public class Main {
    public static void main(String[] args) {
        ITDepartment itDepartment = new ITDepartment(50);
        int size = itDepartment.getDepartmentSize();
        System.out.println("IT Department Size: " + size);
    }
}
