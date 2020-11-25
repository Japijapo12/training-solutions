package week05d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {

    @Test
    public void startWithA() {
        ListCounter listCounter = new ListCounter();

        List<String> testList = Arrays.asList("alma", "ananász", "káposzta", "Avokádó", "kiwi");

        assertEquals(3, listCounter.letterCounter(testList));
    }


    @Test
    public void startWithoutA() {
        ListCounter listCounter = new ListCounter();

        List<String> testList = Arrays.asList("káposzta", "kiwi");

        assertEquals(0, listCounter.letterCounter(testList));
    }

    @Test
    public void LengthNull() {
        ListCounter listCounter = new ListCounter();

        List<String> testList = Arrays.asList();

        assertEquals(0, listCounter.letterCounter(testList));
    }

}
