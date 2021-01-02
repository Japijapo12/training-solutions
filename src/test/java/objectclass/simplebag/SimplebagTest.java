package objectclass.simplebag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimplebagTest {

    SimpleBag simpleBag = new SimpleBag();

    @Test
    public void ConstructorTest() {
        assertTrue(simpleBag.isEmpty());
        assertEquals(0, simpleBag.size());
    }

    public void testPut() {
        //Given
        SimpleBag simpleBag = new SimpleBag();
        //When
        simpleBag.putItem("kenyér");
        simpleBag.putItem(new Book("Dosztojevszkij", "Bűn és bűnhődés"));
        simpleBag.putItem(new Beer("Soproni", 300));
        //Then
        assertFalse(simpleBag.isEmpty());
        assertEquals(3, simpleBag.size());
    }

    @Test
    public void testIteration() {
        //Given
        SimpleBag bag = new SimpleBag();
        //When
        bag.putItem(new Beer("Heineken", 250));
        bag.putItem(new Book("Rejtő Jenő", "Az ellopott cirkáló"));
        bag.putItem(new Beer("Borsodi", 239));
        //Then
        while (bag.hasNext()) {
            assertTrue(bag.next().getClass().toString().contains("B"));
        }
        assertEquals(2, bag.getCursor());
    }

    @Test
    public void testContains() {
        //Given
        SimpleBag bag = new SimpleBag();
        //When
        bag.putItem(new Beer("Borsodi", 239));
        bag.putItem(new Book("Rejtő Jenő", "Az ellopott cirkáló"));
        //Then
        assertTrue(bag.contains(new Beer("Borsodi", 239)));
        assertTrue(bag.contains(new Book("Rejtő Jenő", "Az ellopott cirkáló")));
        assertFalse(bag.contains(new Book("Rejtő Jenő", "A megkerült cirkáló")));
    }
}
