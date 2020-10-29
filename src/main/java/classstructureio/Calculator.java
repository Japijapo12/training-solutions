package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Kérlek, adj meg egy számot!");
        Scanner scanner = new Scanner(System.in);
        int NumberOne = scanner.nextInt();

        System.out.println("Adj meg egy másik számot is!");
        Scanner scanner2 = new Scanner(System.in);
        int NumberTwo = scanner2.nextInt();

        System.out.println(NumberOne + " + " + NumberTwo);
        System.out.println(NumberOne + NumberTwo);

    }


}
