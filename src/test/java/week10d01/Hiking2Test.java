package week10d01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Hiking2Test {

    @Test
    void getPlusElevation() {

        Hiking2 hiking2 = new Hiking2();

        double result;

        result = hiking2.getPlusElevation(List.of(10d,20d,15d,18d));

        assertEquals(13,result);
    }
}