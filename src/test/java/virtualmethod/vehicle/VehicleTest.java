package virtualmethod.vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    @Test
    public void getGrossLoadTest() {
        Vehicle vehicle = new Vehicle(1000);

        assertEquals(1075, vehicle.getGrossLoad());


        System.out.println(vehicle.toString());

    }
}
