package DepartmentNo;

public class ITDepartment extends Department {
    private final int numberOfEmployees;

    public ITDepartment(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public int getDepartmentSize() {
        return numberOfEmployees;
    }
}
