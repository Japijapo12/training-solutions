package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SalesPersonTest {

    @Test
    public void testCreateSalesperson() {
        Salesperson salesperson = new Salesperson("John Doe", 2000);
        assertEquals("John Doe", salesperson.getName());
        assertEquals(2000, salesperson.getAmount());
    }


}
