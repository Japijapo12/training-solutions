package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {
    public SalesPerson selectSalesPersonWithFurthestAboveTarget(List<SalesPerson> sales) {
        SalesPerson salespersonWithFurthestAboveTarget = null;
        for (SalesPerson salesperson : sales) {
            if (salespersonWithFurthestAboveTarget == null
                    || (salesperson.getDifferenceFromTarget() > 0 && salesperson.getDifferenceFromTarget() > salespersonWithFurthestAboveTarget.getDifferenceFromTarget())) {
                salespersonWithFurthestAboveTarget = salesperson;
            }
        }
        return salespersonWithFurthestAboveTarget;
    }
}
