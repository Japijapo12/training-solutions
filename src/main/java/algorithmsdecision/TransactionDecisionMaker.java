package algorithmsdecision;

import java.time.LocalDateTime;
import java.util.List;

public class TransactionDecisionMaker {

    public boolean containsCreditEntryGreaterThan(List<Transaction> transactions, LocalDateTime start, LocalDateTime end, int minAmount) {
        for (Transaction transaction : transactions) {
            if (transaction.isDebit()
                    && transaction.getDateOfTransacion().isAfter(start)
                    && transaction.getDateOfTransacion().isBefore(end)
                    && transaction.getAmount() > minAmount) {
                return true;
            }
        }
        return false;
    }
}
