package exam03;

import java.time.LocalDate;
import java.util.*;

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
        throw new IllegalStateException("No passenger found with this name:" + name);
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> names = new ArrayList<>();
        for (Passenger passenger : passengers) {
            String name = passenger.getName();
            names.add(name);


        }
        Collections.sort(names);
        return names;
    }

    public double sumAllBookingsCharged() {

        double sum = 0;
        for (Passenger passenger : passengers) {
            sum += getPriceForPassenger(passenger);
        }
        return sum;
    }

    public Map<CruiseClass, Integer> countPassengerByClass() {
        Map<CruiseClass, Integer> result = new HashMap<>();

        for(Passenger passenger : passengers) {
            Integer prevValue = result.get(passenger.getCruiseClass());
            if (prevValue == null) {
                result.put(passenger.getCruiseClass(), 1);
            } else {
                result.put(passenger.getCruiseClass(), prevValue + 1);
            }
        }
        return result;

    }


}

