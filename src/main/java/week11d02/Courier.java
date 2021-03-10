package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    List<Ride> rides = new ArrayList<>();// fuvarok listája

   public void addRide(Ride newRide) {

        int i = 0;
        for (Ride ride : rides) {
            if (ride.getRideNumber() < rides.get(i).getRideNumber()
                    && ride.dayOfWeek.dayIndex < rides.get(i).dayOfWeek.dayIndex
                    && isOrderOk(ride)) {
                rides.add(ride);
            } else {
                throw new IllegalArgumentException("ez a fuvar nem adható a listához!");
            }

        }
    }

    private boolean isOrderOk(Ride ride) {
        int i = 0;
        if (ride.dayOfWeek.dayIndex == rides.get(i).dayOfWeek.dayIndex) {
            if(ride.getRideNumber() < rides.get(i).getRideNumber()) {
                return true;
            }
            else {
                return false;
            }
        }
        return ride.getRideNumber() == 1;

    }

}
