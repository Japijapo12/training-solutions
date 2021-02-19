package algorithmsdecision;

import java.time.LocalDateTime;

public class Transaction {

    private String accountNumber;
    private TransactionOperation transactionOperation; //DEBIT vagy CREDIT
    private int amount;
    private LocalDateTime dateOfTransacion;
    private Status status;

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount, LocalDateTime dateOfTransacion, Status status) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
        this.dateOfTransacion = dateOfTransacion;
        this.status = status;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDateTime getDateOfTransacion() {
        return dateOfTransacion;
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
