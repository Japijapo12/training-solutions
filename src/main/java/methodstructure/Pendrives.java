package methodstructure;

import java.util.List;

public class Pendrives {

    public Pendrive best(List<Pendrive> pendrives) {

        Pendrive bestratePendrive = pendrives.get(0);
        for (int i = 1; i < pendrives.size(); i++) {
            if (bestratePendrive.comparePricePerCapacity(pendrives.get(i)) == 1) {
                bestratePendrive = pendrives.get(i);
            }
        }
        return bestratePendrive;
    }

    Pendrive cheapest(List<Pendrive> pendrives) {
        Pendrive cheapestPendrive = pendrives.get(0);
        for (int j = 0; j < pendrives.size(); j++) {
            if (pendrives.get(j).cheaperThan(cheapestPendrive)) {
                cheapestPendrive = pendrives.get(j);
            }
        }
        return cheapestPendrive;
    }
}
