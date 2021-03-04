package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String word, char letter) {
        char [] wordArray = word.toCharArray();
        List<Integer> result = new ArrayList<>();

            for (int i = 0; i <wordArray.length; i++) {

                if ( wordArray[i] == letter) {
                    result.add(i);
                }
            }
            return result;
        }


    public static void main(String[] args) {
        Search search = new Search();
        System.out.println(search.getIndexesOfChar("almafa", 'a'));
    }
}



/*
A Search osztályban írj egy getIndexesOfChar() metódust, mely első paraméterként vár egy String értéket,
második paraméterként egy char értéket! Visszaad egy listát, melyben visszaadja,
hogy a karakter hanyadik indexeken szerepel az első paraméterként átadott listában.

Pl.: almafa szóban a a karakter: 0, 3, 5.
 */