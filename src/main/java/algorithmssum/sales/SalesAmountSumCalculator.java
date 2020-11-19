package algorithmssum.sales;

import java.util.List;

public class SalesAmountSumCalculator {

    public int sumAmount(List<Salesperson> salespersons) {
        int sum = 0;
        for (Salesperson salesperson: salespersons) {
            sum += salesperson.getAmount();
        }
        return sum;
    }
}
