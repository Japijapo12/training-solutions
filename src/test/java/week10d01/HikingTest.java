package week10d01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HikingTest {

    Hiking hiking = new Hiking();



    @Test
    public void getPlusElevationTest() {
        List<Double> hights = Arrays.asList(10.0, 20.0, 15.0, 18.0);
        assertEquals(13, hiking.getPlusElevation(hights));
    }
}
