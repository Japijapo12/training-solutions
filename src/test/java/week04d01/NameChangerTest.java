package week04d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameChangerTest {


    @Test
    public void changeFirstName() {
        NameChanger nameChanger = new NameChanger("John Doe");

        assertEquals("Jack Doe", nameChanger.changeFirstName("Jack"));
    }
}
