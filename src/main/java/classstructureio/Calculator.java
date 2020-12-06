package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Kérlek, adj meg egy számot!");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();

        System.out.println("Adj meg egy másik számot is!");
        int numberTwo = scanner.nextInt();

        System.out.println(numberOne + " + " + numberTwo);
        System.out.println(numberOne + numberTwo);

    }


}
