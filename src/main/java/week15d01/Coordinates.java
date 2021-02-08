package week15d01;

import java.util.Map;

public class Coordinates {

    //x key, y object
    public Map.Entry<Double, Double> maxValueEntry(Map<Double, Double> graphOfFunction) {

        if (graphOfFunction.isEmpty() || graphOfFunction.containsValue(Double.MIN_VALUE)) {
            throw new IllegalArgumentException("Wrong param!");
        }

        Map.Entry<Double, Double> maxElement = null;
        double maxValue = Double.MIN_VALUE;

        for (Map.Entry<Double, Double> actual :  graphOfFunction.entrySet()) {
            if(maxElement == null || maxElement.getValue() < actual.getValue()) {
                maxElement = actual;
            }
        }
        return maxElement;
    }
}
