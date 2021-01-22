package ioreadstring.transaction;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    private List<BankAccount> accountsList = new ArrayList<>();

    public void LoadAccountsListFromFile(String file) {

        Path accounts = Path.of(file);

        try {
            List<String> accountsFromFile = Files.readAllLines(accounts);
            for(String account : accountsFromFile) {
                String[] accountParts = account.split(";");

                BankAccount bankAccount = new BankAccount(accountParts[0], accountParts[1], Integer.parseInt(accountParts[2]));
                //bankszámla: név, számlaszám(String), balance(amit most Stringből egészszámmá alakítunk)

                accountsList.add(bankAccount);
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not open file", e);
        }
    }

    public void makeTransactions(String file) {
        Path transactions = Path.of(file);

        try {
            List<String> transactionList = Files.readAllLines(transactions);

            //a tranzakciók listája bankszámlaszám(temp[0])--utalás-összeg (temp[1]) párosokból áll

            for ( String transaction : transactionList ) {
                String[] temp = transaction.split(";");

                for ( BankAccount bankAccount : accountsList) {
                    if (temp[0].equals(bankAccount.getAccountNumber())) {
                        bankAccount.setBalance(Double.parseDouble(temp[1]));
                    }
                }
            }


        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }

    }

    public List<BankAccount> getAccountsList() {
        return accountsList;
    }

}









//Banki tranzakciók
//Ehhez a feladathoz két fájl tartalmát is fel kell dolgoznod.
// Az accouts.txt tartalmazza a bankszámla(BankAccount) adatokat.
// A transactions.txt állomány tartalmazza az utalásokat azaz, hogy melyik számlára mennyit utaltunk.
// A feladat, hogy olvasd be a számlaadatokat egy listába, majd egy másik metódusban hajtsd végre a tranzakciókat!