package introdate.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    @Test
    void getName() {
        Employee employee = new Employee("John Doe",1980, 1, 1);

        assertEquals("John Doe", employee.getName());
    }

    @Test
    void getDateOfBirth() {
        Employee employee = new Employee("John Doe",1980, 1,1);
        System.out.println(employee.getDateOfBirth());

    }

    @Test
    void getBeginEmployment() {
        Employee employee = new Employee("John Doe",1980,1,1);
        System.out.println(employee.getBeginEmployment());
    }



}