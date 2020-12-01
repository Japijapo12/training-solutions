package week05d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void UserValidatorTest() {
        User user = new User("John", "Doe", "johnd@gmail.com");

        assertEquals("John Doe", user.getFullName());
    }

    @Test
    public void test() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Hibás emailcím");

        });
    }

}
