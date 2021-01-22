package ioreadstring.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    public void createAccountTest() {
        BankAccount bankAccount = new BankAccount("John Doe", "111111-222222", 2000000);

        assertEquals("John Doe", bankAccount.getName());
        assertEquals("111111-222222", bankAccount.getAccountNumber());
        assertEquals(2000000, bankAccount.getBalance());
    }

}