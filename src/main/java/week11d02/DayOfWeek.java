package week11d02;

public enum DayOfWeek {

    HÉTFŐ(1), KEDD(2), SZERDA(3), CSÜTÖRTÖK(4), PÉNTEK(5), SZOMBAT(6), VASÁRNAP(7);

    int dayIndex;

    DayOfWeek(int dayIndex) {
        this.dayIndex = dayIndex;
    }
}
