package activity;

public class Coordinate {

    private final double latitude;
    private final double longitude;

    public Coordinate(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        if (- 90 > latitude || latitude > 90 ) {
            throw new IllegalArgumentException("latitude must be between -90 and 90!");
        }
        if (- 180 > longitude || longitude > 180 ) {
            throw new IllegalArgumentException("longitude must be between -180 and 180!");
        }
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }



}
