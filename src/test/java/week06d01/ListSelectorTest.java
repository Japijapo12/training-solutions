package week06d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ListSelectorTest {

    ListSelector ls = new ListSelector();

    @Test
    public void getEvenIndexElementsTest() {
        assertEquals("almabarack", ls.getEvenIndexElements(Arrays.asList("alma", "körte", "barack")));
    }

    @Test
    public void getEvenIndexElementsWithEmptyList(){
        assertEquals("", ls.getEvenIndexElements(new ArrayList<>()));
    }
}
