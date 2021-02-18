package algorithmscount;

import java.util.List;

public class BankAccountConditionCounter {



    public int conditionCounter(List<BankAccount> bankAccounts, int minBalace) {

        int count = 0;
        for (BankAccount account : bankAccounts) {
            if (account.getBalance() > minBalace) {
                count ++;
            }
        }
        return count;
    }
}
