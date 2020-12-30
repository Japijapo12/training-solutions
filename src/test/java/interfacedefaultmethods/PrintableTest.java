package interfacedefaultmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintableTest {

    //TestPrintable.java létrehozása nélkül hibát jelez -> public class TestPrintable implements Printable

    @Test
    public void testGetColorBlack() {

        Printable printable = new TestPrintable();
        assertEquals(Printable.BLACK, printable.getColor(0));

    }
}
