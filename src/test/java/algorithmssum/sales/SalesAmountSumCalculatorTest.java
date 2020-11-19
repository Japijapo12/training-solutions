package algorithmssum.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesAmountSumCalculatorTest {

    @Test
    public void testSumSalesAmount() {
        SalesAmountSumCalculator test = new SalesAmountSumCalculator();

        List<Salesperson> salespersons = Arrays.asList(

                new Salesperson("John Doe", 2000),
                new Salesperson("Jack Doe", 4000),
                new Salesperson("Kovács jános", 5000),
                new Salesperson("Szabó Béla", 3000),
                new Salesperson("Kis Aladár", 6000)

    );
        assertEquals(20000, test.sumAmount(salespersons));
    }
}
