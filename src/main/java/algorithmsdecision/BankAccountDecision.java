package algorithmsdecision;

import java.util.List;

public class BankAccountDecision {



    public boolean accountMoreThanMinAmount(int minAmount, List<BankAccount> bankAccounts) {

        for (BankAccount account : bankAccounts) {
            if ( account.getBalance() > minAmount) {
                return true;
            }
        }
        return false;

    }
}
