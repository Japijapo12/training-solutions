package statemachine.trafficlight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficLightTest {

    @Test
    public void TestNext() {

        assertEquals(TrafficLight.RED, TrafficLight.YELLOW.next());
        assertEquals(TrafficLight.YELLOW, TrafficLight.GREEN.next());
        assertEquals(TrafficLight.GREEN, TrafficLight.RED_YELLOW.next());
        assertEquals(TrafficLight.RED_YELLOW, TrafficLight.RED.next());


    }
}
