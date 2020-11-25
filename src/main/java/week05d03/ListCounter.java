package week05d03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//rj egy olyan metódust az week05.d03.ListCounter osztályban, mely egy kapott Listából (String) összeszámolja azokat amik 'a' vagy 'A' betűvel kezdődnek,
//Ha nulla elemű a tömb,vagy nincs benne ilyen elem, akkor 0-t adjon vissza.


public class ListCounter {


    public int letterCounter(List<String> words) {
        int count = 0;
        for (String word : words) {
            if (word.toLowerCase().startsWith("a")) {
                count++;
            }


        }
        return count;
    }

    public static void main(String[] args) {
        ListCounter listCounter = new ListCounter();
        List<String> words = new ArrayList<>();
        words.add("alma");
        words.add("ananász");
        words.add("káposzta");
        words.add("Avokádó");
        words.add("kiwi");

        System.out.println(listCounter.letterCounter(words));

        }

}

