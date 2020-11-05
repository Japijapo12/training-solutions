package statements;

import java.util.Scanner;

public class InvestMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Befektetésre szánt összeg:");
        int found = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kamatláb:");
        int interestRate = scanner.nextInt();
        scanner.nextLine();

        Investment investment = new Investment(found, interestRate);

        System.out.println("Hány napig tartja a bankban a pénzét? (napok száma)");
        int days = scanner.nextInt();

        System.out.println("Hozam " + days + " nap után: " + investment.getYield(days));


        System.out.println("Kivett összeg " + days + " nap után: " + investment.close(days));

        System.out.println("Kivett összeg " + days + " nap után: " + investment.close(days));
    }
}
