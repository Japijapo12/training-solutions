package algorithmsdecision;

import java.time.LocalDateTime;

public class Transaction {

    private String accountNumber;
    private TransactionOperation transactionOperation; //DEBIT vagy CREDIT
    private int amount;
    private LocalDateTime dateOfTransaction;
    private Status status;

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount, LocalDateTime dateOfTransaction, Status status) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
        this.dateOfTransaction = dateOfTransaction;
        this.status = status;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getDateOfTransaction() {
        return dateOfTransaction;
    }

    public boolean isDebit() {
        return transactionOperation == TransactionOperation.DEBIT;
    }

    public boolean isCredit() {
        return transactionOperation == TransactionOperation.CREDIT;
    }


    public void setExecutedSuccessfully(){
        status = Status.SUCCEEDED;
    }

    public void setNotExecutedSuccessfully(){
        status = Status.PENDING;
    }
}
