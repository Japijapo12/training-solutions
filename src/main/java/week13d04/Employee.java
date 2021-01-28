package week13d04;

public class Employee {

   private String name;
   private String yearOfBirth;

    public Employee(String name, String yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString() {
        return "Az alkalmazott neve: " + name + ", " + "születési éve: " + yearOfBirth;
    }
}
