package introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a=");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("b=");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("c=");
        int c = scanner.nextInt();
        scanner.nextLine();
        System.out.println("d=");
        int d = scanner.nextInt();
        scanner.nextLine();
        System.out.println("e=");
        int e = scanner.nextInt();
        scanner.nextLine();

        System.out.println(a+b+c+d+e);
    }
}
