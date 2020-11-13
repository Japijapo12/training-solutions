package introcontrol;

import java.util.Scanner;

public class IntrocontrolMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy számot!");
        int number = scanner.nextInt();

        Introcontrol introcontrol = new Introcontrol();

        System.out.println(introcontrol.substractTenIfGreaterThanTen(number));


        System.out.println(introcontrol.describeNumber(10));
        System.out.println(introcontrol.describeNumber(0));


        System.out.println(introcontrol.greetingToJoe("Joe"));
        System.out.println(introcontrol.greetingToJoe(null));


        System.out.println(introcontrol.calculateBonus(1200000));
        System.out.println(introcontrol.calculateBonus(80000));


        System.out.println(introcontrol.calculateConsumption(8000, 300));
        System.out.println(introcontrol.calculateConsumption(200, 3000));


        introcontrol.printNumbers(20);

        introcontrol.printNumberBetween(20,30);

        introcontrol.printNumberBetweenAnyDirection(1,10);
        introcontrol.printNumberBetweenAnyDirection(11,2);

        introcontrol.printOddNumbers(11);








    }

}
