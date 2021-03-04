package week04d03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random  random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);

        int guess = 0;
        int numberOfGuesses = 0;

        while  (guess != number && numberOfGuesses < 6) {
            System.out.println("Írj be egy számot!");
            guess = Integer.parseInt(scanner.nextLine());
            numberOfGuesses ++;
            System.out.println(numberOfGuesses + ". kérdés. Maradt még " + (6 - numberOfGuesses) + " lehetőséged");

            if (guess < number) {
                System.out.println(" A Gondolt szám nagyobb!");
            }
            if (guess > number) {
                System.out.println("A Gondolt szám kisebb!");
            }

            if (guess == number) {
                System.out.println("Eltaláltad!");
            }

        }

    }
}


/*
Írj egy számkitaláló programot a GuessTheNumber osztályba! A program kitalál egy véletlenszerű számot 1 és 100 között.
Majd bekér a felhasználótól ciklusban számokat. Mindig megmondja, hogy a szám, kisebb, nagyobb vagy egyenlő-e mint a gondolt szám.

Bónusz feladat: max 6-szor lehet kérdezni!
 */