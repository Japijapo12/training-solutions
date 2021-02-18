package algorithmsmax.sales;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SalesPersonMaxTest {

    List<SalesPerson> salespersons = Arrays.asList(
            //new SalesPerson("John", 600, 500),
            new SalesPerson("Bill", 200, 300),
            new SalesPerson("Kate", 700, 100),
            new SalesPerson("Mary", 700, 300),
            new SalesPerson("Karl", 200, 50)
    );

    @Test
    public void testsalesPersonMaxAmount() {
        SalesPersonMax maxAmount = new SalesPersonMax();

        assertEquals(700, maxAmount.salesPersonMaxAmount(salespersons).getAmount());
        assertEquals(100, maxAmount.salesPersonMaxAmount(salespersons).getTarget());
    }

    @Test
    public void testsalesPersonMaxTargetDifference() {
        SalesPersonMax aboveTarget = new SalesPersonMax();

        assertEquals(600, aboveTarget.salesPersonMaxTargetDifference(salespersons).getDifferenceFromTarget());
        assertEquals(700, aboveTarget.salesPersonMaxTargetDifference(salespersons).getAmount());
        assertEquals(100, aboveTarget.salesPersonMaxTargetDifference(salespersons).getTarget());
    }
}

    /*@Test
    public void testSelectSalesPersonWithFurthestBelowTarget() {
        SalespersonWithFurthestBelowTargetSelector belowTarget = new SalespersonWithFurthestBelowTargetSelector();

        assertEquals(-100, belowTarget.selectSalesPersonWithFurthestBelowTarget(salespersons).getDifferenceFromTarget());
        assertEquals(200, belowTarget.selectSalesPersonWithFurthestBelowTarget(salespersons).getAmount());
        assertEquals(300, belowTarget.selectSalesPersonWithFurthestBelowTarget(salespersons).getTarget());
    }*/

