package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        System.out.println("Felhasználónév:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("E-mail:");
        String email = scanner.nextLine();

        System.out.println("Ön az alábbi adatokkal regisztrált:");
        System.out.println("Felhasználónév: " + name + ", Email-cím: " + email);
    }
}
