package inheritanceattributes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getTitleTest() {

        Book book = new Book("Java kezdőknek", 3000);

        assertEquals("Java kezdőknek", book.getTitle());
        assertEquals(3000, book.price);
    }

    @Test
    void testPurchase() {
        Book book = new Book("Java kezdőknek", 2500);

        assertEquals(5000, book.purchase(2));
    }
}