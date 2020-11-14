package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {

        System.out.println("Adjon meg egy időpontot! Óra: ");
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();

        System.out.println("Perc: ");
        int m1 = scanner.nextInt();

        System.out.println("Másodperc: ");
        int s1 = scanner.nextInt();

        Time time1 = new Time(h1, m1, s1);

        System.out.println("Adjon meg egy másik időpontot! Óra: ");
        int h2 = scanner.nextInt();

        System.out.println("Perc: ");
        int m2 = scanner.nextInt();

        System.out.println("Másodperc: ");
        int s2 = scanner.nextInt();

        Time time2 = new Time(h2, m2, s2);



        System.out.println("Az első időpont: " + time1.toString() + " percekre kerekítve: " + time1.getInMinutes() + " perc");
        System.out.println("Az első időpont: " + time1.toString() + " másodpercekre kerekítve: " + time1.getInSeconds() + " másodperc");

        System.out.println("A második időpont: " + time2.toString() + " percekre kerekítve: " + time2.getInMinutes() + " perc");
        System.out.println("A második időpont: " + time2.toString() + " másodpercekre kerekítve: " + time2.getInSeconds() + " másodperc");


        System.out.println(time2.earlierThen(time1));




    }
}
