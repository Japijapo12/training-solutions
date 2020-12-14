package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotTest {

    @Test
    public void testMoveRobot() {
        Robot robot = new Robot();
        robot.move("FFFLLBBBJJ");
        assertEquals(-1, robot.getPosition().getX());
        assertEquals(1, robot.getPosition().getY());
    }

}
