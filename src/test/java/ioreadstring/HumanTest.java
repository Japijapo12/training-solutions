package ioreadstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    private Human human = new Human("Kovács", "János");

    @Test
    void getFirstName() {

        assertEquals("Kovács", human.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("János", human.getLastName());
    }
}