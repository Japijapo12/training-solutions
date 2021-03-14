package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {
    public SalesPerson selectSalesPersonWithFurthestBelowTarget(List<SalesPerson> sales) {
        SalesPerson salespersonWithFurthestBelowTarget = null;
        for (SalesPerson salesperson : sales) {
            if (salespersonWithFurthestBelowTarget == null
                    || (salesperson.getDifferenceFromTarget() < 0 && salesperson.getDifferenceFromTarget() < salespersonWithFurthestBelowTarget.getDifferenceFromTarget())) {
                salespersonWithFurthestBelowTarget = salesperson;
            }
        }
        return salespersonWithFurthestBelowTarget;
    }
}
