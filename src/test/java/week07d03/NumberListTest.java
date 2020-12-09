package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class NumberListTest {

    @Test
    public void sortedListtest() {
        NumberList numberList = new NumberList();

       assertFalse(numberList.isIncreasing(Arrays.asList(2, 3, 3, 4, 1)));
       assertTrue(numberList.isIncreasing(Arrays.asList(1, 2, 3, 3, 4)));
       assertTrue(numberList.isIncreasing(Arrays.asList(3, 3, 3, 3, 3)));
    }
}
