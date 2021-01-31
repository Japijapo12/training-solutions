package introexception.patient;

public class Patient {

    private String name;
    private String ssn;  //socialSecurityNumber
    private int yearOfBirth;

    public Patient(String name, String ssn, int yearOfBirth) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name can not be empty");
        }

        if (yearOfBirth < 1900 || yearOfBirth > 2022) {
            throw new IllegalArgumentException("Invalid value? " + yearOfBirth);
        }

        this.name = name;
        this.ssn = ssn;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
