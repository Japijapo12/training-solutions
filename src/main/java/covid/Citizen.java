package covid;

import java.time.LocalDate;

public class Citizen {
    private String name;
    private String zip;
    private int age;
    private String email;
    private String taj;
    private int numberOfVaccination;
    private LocalDate lastVaccination;


    public Citizen(String name, String zip, int age, String email, String taj, int numberOfVaccination, LocalDate lastVaccination) {
        this.name = name;
        this.zip = zip;
        this.age = age;
        this.email = email;
        this.taj = taj;
        this.numberOfVaccination = numberOfVaccination;
        this.lastVaccination = lastVaccination;
    }

    public Citizen(String name, String zip, int age, String email, String taj) {
        this.name = name;
        this.zip = zip;
        this.age = age;
        this.email = email;
        this.taj = taj;
    }

    public String getName() {
        return name;
    }

    public String getZip() {
        return zip;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getTaj() {
        return taj;
    }

    public int getNumberOfVaccination() {
        return numberOfVaccination;
    }

    public LocalDate getLastVaccination() {
        return lastVaccination;
    }
}

