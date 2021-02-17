package intromethods;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 1980, 200_000);

        employee.raiseSalary(100_000);

        System.out.println(employee.toString());
    }
}
