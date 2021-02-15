package exam03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Cruise(Boat boat, LocalDate sailing, double basePrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basePrice;
    }

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }


    public void bookPassenger(Passenger passenger) {
        if (passengers.size() > boat.getMaxPassengers()) {
            throw new IllegalArgumentException("Nincs több hely a hajóra");
        } else {
            passengers.add(passenger);
        }
    }

    public double getPriceForPassenger(Passenger passenger) {

        return basicPrice * passenger.getCruiseClass().getBoatPrice();

    }

    public Passenger findPassengerByName(String name) {
        for(Passenger passenger : passengers) {
            if (passenger.getName().equals(name)) {
                return passenger;
            }

        }
        throw new IllegalStateException("No airplain found with this name:" + name);
    }


}

