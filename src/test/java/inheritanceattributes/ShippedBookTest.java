package inheritanceattributes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShippedBookTest {

    @Test
    void toStringTest() {
        ShippedBook shippedBook = new ShippedBook("Háború és béke", 4000, 1200);

        assertEquals("Háború és béke: 4000 + 1200", shippedBook.toString());
    }
}