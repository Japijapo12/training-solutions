package collectionsautoboxing;

import java.util.ArrayList;
import java.util.List;

public class IntegerOperation {

    public List<Integer> createList(int... numbers) {
        List<Integer> numberList = new ArrayList<>();
        for ( int number : numbers) {
            numberList.add(number);
        }
        return numberList;
    }

    public int sumIntegerList(List<Integer> integerList) {
        int sum = 0;
        for (int number : integerList) {
            sum += number;
        }
        return sum;
    }

    public int sumIntegerObjects(Integer... integers) {
        int sum = 0;
        for (Integer object : integers) {
            sum += object;
        }
        return sum;
    }
}
