package interfacedefaultmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewsPaperTest {

    @Test
    public void testAddPage() {

        Newspaper newspaper = new Newspaper();

        assertEquals(0, newspaper.getLength());

        newspaper.addPage("page 1");
        assertEquals(1, newspaper.getLength());

        assertEquals("page 1", newspaper.getPage(0));

        assertEquals(Printable.BLACK, newspaper.getColor(0));

    }
}
