package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    //Használj egy private Day nextDay(Day day) segédmetódust, mely megmondja a
    //paraméterként megadott nap után következő napot!

    //"Vasárnap után hétfő következik:" (Day.values() - a Day (enum)tömb elemei),
    // day.ordinal() az adott elem sorszáma

    private Day nextday(Day day) {
        if ( day.ordinal() == Day.values().length -1 ) {    // 7-1=6. elem = vasárnap, mert 0 az első
            return Day.values()[0];                        //ez a hétfő
        } else {
            return Day.values()[day.ordinal() + 1];        //next day!
        }
    }


    List<DayType> dayTypes(Day firstDay, int numberOfDays) {
        List<DayType> dayTypes = new ArrayList<>();

        for(int i=0; i< numberOfDays; i++) {
            dayTypes.add(firstDay.getDayType());
            firstDay = nextday(firstDay);
        }
        return dayTypes;
    }

}
