package inheritanceconstructor.cars;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacitiy, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel > extraCapacity) {
            throw new IllegalArgumentException("Auxiliary capacity is less than extra fuel!");
        }
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public void modifyFuelAmount(double fuel) {
        super.modifyFuelAmount(fuel);
    }

    private boolean isEnoughFuelJeep(int km) {
       return (super.getFuel() + extraFuel - (super.getFuelRate()/100 * km)) >= 0;
    }

    public void drive(int km) {
        if (!isEnoughFuelJeep(km)) {
            throw new RuntimeException("Not enough fuel available!");
        }
        double usedFuel = km * super.getFuelRate() / 100;
        extraFuel -= usedFuel;
        if (extraFuel < 0) {
            modifyFuelAmount(extraFuel);
            extraFuel = 0;
        }
    }

    public double calculateRefillAmount() {
        return (super.getTankCapacity() + extraCapacity) - (super.getFuel() + extraFuel);
    }

    public double getExtraFuel() {
        return extraFuel;
    }
}