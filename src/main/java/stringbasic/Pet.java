package stringbasic;

import java.time.LocalDate;

public class Pet {
    private String name;
    private LocalDate DateOfBirth;
    private Gender gender;
    private String regNumber;

    public Pet(String name, LocalDate dateOfBirth, Gender gender, String regNumber) {
        this.name = name;
        DateOfBirth = dateOfBirth;
        this.gender = gender;
        this.regNumber = regNumber;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public String getRegNumber() {
        return regNumber;
    }
}
