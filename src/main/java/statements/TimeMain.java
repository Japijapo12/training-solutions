package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {

        System.out.println("Adjon meg egy időpontot! Óra: ");
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();

        System.out.println("Perc: ");
        Scanner scanner2 = new Scanner(System.in);
        int m = scanner2.nextInt();

        System.out.println("Másodperc: ");
        Scanner scanner3 = new Scanner(System.in);
        int s = scanner3.nextInt();

        Time time = new Time(h, m, s);

        System.out.println("Ez az időpont: " + time.toString() + " percekre kerekítve: " + time.getInMinutes() + " perc");

    }
}
