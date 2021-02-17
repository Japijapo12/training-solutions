package numbers;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg az első kör átmérőjét!");
        int diameter1 = scanner.nextInt();
        Circle circle1 = new Circle(diameter1);

        System.out.println("Adja meg a második kör átmérőjét!");
        int diameter2 = scanner.nextInt();
        Circle circle2 = new Circle(diameter2);

        System.out.println("Az első kör kerülete = " + circle1.perimeter(diameter1));
        System.out.println("Az első kör területe = " + circle1.area(diameter1));

        System.out.println("A második kör kerülete = " + circle2.perimeter(diameter2));
        System.out.println("A második kör területe = " + circle2.area(diameter2));
    }
}
