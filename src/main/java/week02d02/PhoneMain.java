package week02d02;

import java.util.Scanner;

public class PhoneMain {
    public static void main(String[] args) {

        System.out.println("A első készülék típusa:");
        Scanner scanner = new Scanner(System.in);
        String phone1 = scanner.nextLine();

        System.out.println("Hány Gigabájt a memóriája?");
        int type1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("A második készülék típusa:");
        String phone2 = scanner.nextLine();

        System.out.println("Hány Gigabájt a memóriája?");
        int type2 = scanner.nextInt();


        System.out.println("Az első telefon: " + phone1 + (" ") + type1);
        System.out.println("Az második telefon: " + phone2 + (" ") + type2);


    }
}
