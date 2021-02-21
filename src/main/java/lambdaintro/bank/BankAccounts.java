package lambdaintro.bank;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class BankAccounts {

    private List<BankAccount> bankAccounts;

    public BankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    //rendezés bankszámlaszám alapján

    //Comparator.naturalOrder()
        public List<BankAccount> listBankAccountsByAccountNumber() {
        List<BankAccount> ordered = new ArrayList<>(bankAccounts);
        ordered.sort(Comparator.naturalOrder());
        return ordered;
    }


    //rendezés balance alapján, de előjeltől függetlenül

    //Comparator.comparing()
    public List<BankAccount> listBankAccountsByBalance() {
        List<BankAccount> ordered = new ArrayList<>(bankAccounts);
        ordered.sort(Comparator.comparing( (a) -> Math.abs(a.getBalance())));
        return ordered;
    }


    //rendezés balance alapján, de az előjel számít, csökkenő sorrendben

    //Comparator.comparing().reversed()
    public List<BankAccount> listBankAccountsByBalanceDesc() {
        List<BankAccount> ordered = new ArrayList<>(bankAccounts);
        ordered.sort(Comparator.comparing(BankAccount::getBalance).reversed());
        return ordered;
    }


//név alapján, de ha a név megegyezik, akkor a bankszámlaszám alapján.
    //ha nincs kitöltve a név, akkor értéke 0, előre írva

    ////Comparator.nullsFirst     Comparator.thenComparing
    public List<BankAccount> listBankAccountsByNameThanAccountNumber() {
        List<BankAccount> ordered = new ArrayList<>(bankAccounts);
        Collator collator = Collator.getInstance(new Locale("hu", "HU"));

        ordered.sort(
                Comparator.comparing(BankAccount::getNameOfOwner,
                        Comparator.nullsFirst(collator))
                        .thenComparing(BankAccount::getAccountNumber));
        return ordered;
    }
}
