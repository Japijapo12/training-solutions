package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Adjon meg egy egész számot!");
        int number = scanner.nextInt();

        System.out.println("Ez a szám " + (number % 3 == 0 ?  "osztható hárommal" : "nem osztható hárommal"));

    }
}
