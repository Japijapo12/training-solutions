package covid;

import java.time.LocalDate;

public class Vaccination {

    Citizen citizen;
    private LocalDate first_vaccinationDate;
    private LocalDate second_vaccinationDate;
    private String status;
    private VaccinationType type;
    private String note;

    public Vaccination(Citizen citizen, LocalDate first_vaccinationDate, LocalDate second_vaccinationDate, String status, VaccinationType type, String note) {
        this.citizen = citizen;
        this.first_vaccinationDate = first_vaccinationDate;
        this.second_vaccinationDate = second_vaccinationDate;
        this.status = status;
        this.type = type;
        this.note = note;
    }

    public Citizen getCitizen() {
        return citizen;
    }

    public LocalDate getFirst_vaccinationDate() {
        return first_vaccinationDate;
    }

    public LocalDate getSecond_vaccinationDate() {
        return second_vaccinationDate;
    }

    public String getStatus() {
        return status;
    }

    public VaccinationType getType() {
        return type;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "Vaccination{" +
                "citizen=" + citizen +
                ", first_vaccinationDate=" + first_vaccinationDate +
                ", second_vaccinationDate=" + second_vaccinationDate +
                ", status='" + status + '\'' +
                ", type=" + type +
                ", note='" + note + '\'' +
                '}';
    }
}
