package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VanTest {

    @Test
    public void  getGrossLoad() {
        Van van = new Van(1000, 4, 2500);

            assertEquals(1000 + Van.PERSON_AVERAGE_WEIGHT + (van.numberOfPassenger * Van.PERSON_AVERAGE_WEIGHT) + van.getCargoWeight(), van.getGrossLoad()); //3875
        }

    }
