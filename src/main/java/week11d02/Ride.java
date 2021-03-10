package week11d02;

public class Ride {

    DayOfWeek dayOfWeek;
    private int rideNumber;  //aznap hányadik fuvar
    private int distance;

    public Ride(DayOfWeek dayOfWeek, int rideNumber, int distance) {
        this.dayOfWeek = dayOfWeek;
        this.rideNumber = rideNumber;
        this.distance = distance;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public int getRideNumber() {
        return rideNumber;
    }

    public int getDistance() {
        return distance;
    }
}
