package week10d01;

import java.util.List;

public class Hiking {



    public double getPlusElevation(List<Double>hights) {
        double sum = 0;
        for( int i = 1; i < hights.size(); i ++) {
            if ( hights.get(i) > hights.get(i-1) ) {
                sum += hights.get(i)-hights.get(i-1);
            }
        }
        return sum;

    }


}
