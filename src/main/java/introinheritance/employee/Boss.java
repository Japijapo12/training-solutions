package introinheritance.employee;

public class Boss extends Employee {

    public static final double LEADERSHIP_FACTOR = 0.1;   // vezetői pótlék * alkalmazottak száma
    private int numberOfEmployees;

    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }


    @Override
    public double getSalary() {
        double extra = LEADERSHIP_FACTOR * getNumberOfEmployees();
        return super.getSalary() * (1 + extra);
    }


}




