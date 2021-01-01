package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void getGrossLoadTest() {
        Car car = new Car(1000, 4);

        assertEquals(1000 + Car.PERSON_AVERAGE_WEIGHT + 4 * car.PERSON_AVERAGE_WEIGHT, 1375);
    }


}
