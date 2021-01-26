package week02d04;

import java.util.Scanner;

public class InputNames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] ArrayOfNames = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Adja meg a nevet:");
            ArrayOfNames[i] = scanner.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". name: " + ArrayOfNames[i]);
        }

    }

}


//Hozz létre egy InputNames Java osztályt, melynek van egy main metódusa. Ciklusban kérj be öt nevet!
// A neveket tárold el egy tömbben! Írd ki a tömb tartalmát, sortöréssel elválasztva
// (írd bele, hogy hanyadik elem 1-től sorszámozva)!
