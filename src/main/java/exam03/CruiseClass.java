package exam03;

public enum CruiseClass {
    LUXURY(3.0), FIRST(1.8), SECOND(1.0);

    private double boatPrice;

    CruiseClass(double boatPrice) {
        this.boatPrice = boatPrice;
    }

    public double getBoatPrice() {
        return boatPrice;
    }
}
