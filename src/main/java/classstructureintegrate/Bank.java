package classstructureintegrate;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

       // megadva az adatokat:

        // BankAccount account1 = new BankAccount("67347342-11112222-00000000","Kovács János", 8000);
        // BankAccount account2 = new BankAccount("33337777-74329324-00000000","Szabó István", 200000);

       // System.out.println("Egyik bankszámla: " + account1.getOwner() + (" (") + account1.getAccountNumber() + "): " + account1.getBalance() );
       // System.out.println("Másik bankszámla: " + account2.getOwner() + (" (") + account2.getAccountNumber() + "): " + account2.getBalance() );

       // Bekérve az adatokat:

        System.out.println("Számla tulajdonos:");
        Scanner scanner = new Scanner(System.in);
        String owner = scanner.nextLine();

        System.out.println("Számlaszám:");
        String account = scanner.nextLine();

        System.out.println("Összeg:");
        int amount = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(account, owner, amount);

        bankAccount.setBalance(amount);

        System.out.println("Utalás " + owner + " számára: ");
        int amount2 = scanner.nextInt();

        System.out.println("Az új egyenleg: ");

        bankAccount.deposit(amount2);




        System.out.println(bankAccount.getBalance());
    }
}
