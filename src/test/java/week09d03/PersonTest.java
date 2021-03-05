package week09d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PersonTest {

        @Test
        void testOverFourTeen() {
            Person p = new Person("Jonny", 16);
            p.setPresent();
            assertNotEquals(null, p.getPresent());
            assertNotEquals(Present.TOY, p.getPresent());
        }

        @Test
        void testUnderFourTenn() {
            Person p = new Person("Jack", 10);
            p.setPresent();
            assertNotEquals(null, p.getPresent());
        }
    }

