package week10d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxTravelTest {

    @Test
    void getMaxIndex() {
        int max = new MaxTravel().getMaxIndex(List.of(3,3,12,12,0,3,4,3,3,4,12,3));
        assertEquals(3, max);

    }
}