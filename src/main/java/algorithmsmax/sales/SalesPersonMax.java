package algorithmsmax.sales;

import java.util.ArrayList;
import java.util.List;

public class SalesPersonMax {

    private List<SalesPerson> salesPersons = new ArrayList<>();

    public SalesPerson salesPersonMaxAmount(List<SalesPerson> salesPersons) {
        SalesPerson salesPersonMax = null;
        for (SalesPerson person : salesPersons) {
            if (salesPersonMax == null || person.getAmount() > salesPersonMax.getAmount()) {
                salesPersonMax = person;
            }
        }
        return salesPersonMax;

    }

    public SalesPerson salesPersonMaxTargetDifference(List<SalesPerson> salesPersons) {
        SalesPerson maxTargetPerson = null;
        for (SalesPerson person : salesPersons) {
            if (maxTargetPerson == null || person.getDifferenceFromTarget() > maxTargetPerson.getDifferenceFromTarget()) {
                maxTargetPerson = person;
            }
        }
        return maxTargetPerson;
    }

    public SalesPerson salesPersonMinTargetDifference(List<SalesPerson> salesPersons) {
        SalesPerson minTargetPerson = null;
        for (SalesPerson person : salesPersons) {
            if (minTargetPerson == null || person.getDifferenceFromTarget() < minTargetPerson.getDifferenceFromTarget()) {
                person = minTargetPerson;
            }
        }
        return minTargetPerson;
    }


}
