package ioreadstring.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionManagerTest {

    private TransactionManager transactionManager = new TransactionManager();

    @Test
    public void testUploadAccounts() {

        //még nincs betöltve a lista a fájlból:
        assertEquals(0, transactionManager.getAccountsList().size());

        transactionManager.LoadAccountsListFromFile("src/test/resources/accounts.txt");

        assertEquals(5,transactionManager.getAccountsList().size());
        assertEquals("Jimmy Doe", transactionManager.getAccountsList().get(4).getName());
    }

    @Test
    public void makeTransactionsTest() {
        transactionManager.LoadAccountsListFromFile("src/test/resources/accounts.txt");
        transactionManager.makeTransactions("src/test/resources/transactions.txt");

        assertEquals(1201000, transactionManager.getAccountsList().get(0).getBalance());



    }
}