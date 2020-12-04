package methodoverloading.pubtime;

import methodoverloading.Time;

//legjobb kiválasztását adott listából a Pub (kocsma neve és nyitási időpontja Time osztály használatával),
// valamint a listát tároló ListOfGoodPubs osztály segítségével.

public class Pub {

    private String name;
    private Time openTime;

    public Pub(String name, int hours, int minutes) {
        this.name = name;
        this.openTime = new Time(hours, minutes);
    }

    public String getName() {
        return name;
    }

    public Time getOpenTime() {
        return openTime;
    }

    @Override
    public String toString() {
        return "Pub{" +
                "name='" + name + '\'' +
                ", openTime=" + openTime +
                '}';
    }
}





