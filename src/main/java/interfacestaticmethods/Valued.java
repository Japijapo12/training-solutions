package interfacestaticmethods;

import java.util.List;

public interface Valued {

    double getValue();

    static double sum(List<Valued>valuedList) {
        double sum=0;
        for( Valued valued : valuedList) {
            sum += valued.getValue();
        }
        return sum;
    }
}
