package javaapi;

import java.util.Scanner;

public class Upper {


    public static void main(String[] args) {
        String sentence;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Melyik mondatot alakítsuk nagybetűssé?");
        sentence = scanner.nextLine();

        System.out.println(sentence.toUpperCase());


        System.out.println("Hello World!".toUpperCase());
    }
}


