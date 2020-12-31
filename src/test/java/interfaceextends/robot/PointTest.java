package interfaceextends.robot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    public void PointGetTest() {
        Point point = new Point(3,5,7);

        assertEquals(3, point.getX());
        assertEquals(5, point.getY());
        assertEquals(7, point.getZ());
    }
}
