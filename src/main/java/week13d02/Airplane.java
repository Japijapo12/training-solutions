package week13d02;

import java.time.LocalDate;

public class Airplane {
    private String name;
    private String type; //Arrival or Departure
    private String city;
    private LocalDate date;


    public Airplane(String name, String type, String city, LocalDate date) {
        this.name = name;
        this.type = type;
        this.city = city;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCity() {
        return city;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", city='" + city + '\'' +
                ", arrival/departure=" + date +
                '}';
    }
}
