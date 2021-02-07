package week13d05;

import java.util.HashMap;
import java.util.Map;

public class LetterCounter {

    public int countLetter(String word) {
        Map<String, Integer> abc = new HashMap<>();

        String[] letters = word.toLowerCase().split("");

        for (String letter : letters) {
            Integer prevValue = abc.get(letter);

            if (!abc.containsKey(letter)) {
                abc.put(letter, 1);
            } else {
                abc.put(letter, prevValue + 1);
            }

        }
        return abc.size();
    }


    public static void main(String[] args) {
       LetterCounter letterCounter = new LetterCounter();
        System.out.println(letterCounter.countLetter("paprika"));

    }

}


//Írj egy metódust, amely megszámolja, hogy hány különböző betű van egy szóban.
// A kis és nagybetűk közötti különbség nem számít! A space-eket, számjegyeket, stb. ne vegye figyelembe!
// Csak az angol ábécé betűit!
