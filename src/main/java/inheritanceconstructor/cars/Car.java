package inheritanceconstructor.cars;

public class Car {

    double fuelRate;   //mennyi a fogyasztása
    double fuel;
    double tankCapacity;

    public Car(double fuelRate, double fuel, double tankCapacity) {

        if (fuel > tankCapacity) {
            throw new IllegalArgumentException("Tank capacity is less than fuel!");
        }
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelRate() {
        return fuelRate;
    }

    public double getFuel() {
        return fuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel) {
        this.fuel += fuel;
    }

    // csökkenti az üzemanyag mennyiségét, nem fogyhat ki! FuelRate = Mennyit fogyaszt 100km-en
    public void drive(int km) {
        double restFuel = (fuel - (getFuelRate()/100) * km);
        if (restFuel <= 0) {
            throw  new RuntimeException("Not enough fuel available!");
        }
        fuel = restFuel;
    }

    //kiszámolja, mennyit lehet tankolni
    public double calculateRefillAmount() {
        return tankCapacity - fuel;
    }

}
