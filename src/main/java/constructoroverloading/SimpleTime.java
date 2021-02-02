package constructoroverloading;

public class SimpleTime {

    public static final int MINUTES_IN_HOURS = 60;

    private final int hours;
    private final int minutes;


    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this(hours,0);
    }

    public SimpleTime(SimpleTime time) {
        this(time.hours, time.minutes);
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int difference(SimpleTime time) {
        return timeInMinutes() - time.timeInMinutes();
    }

    private int timeInMinutes() {
        return MINUTES_IN_HOURS * hours + minutes;
    }

    public String toString() {
        return hours + ":" + minutes;
    }

}


//Az osztály objektuma egy időpontot reprezentál egy napon belül, és többféleképpen
//hozható létre. Az objektum el tudja dönteni, hogy a paraméterként kapott azonos típusú
//objektumtól percekben kifejezve mennyire különbözik.

//public SimpleTime(int hours, int minutes)
//public SimpleTime(int hours)
//public SimpleTime(SimpleTime time)