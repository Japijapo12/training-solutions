package ioreadstring;

public class Human {

    private String firstName;
    private String lastName;

    public Human(String forName, String lastName) {
        this.firstName = forName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
