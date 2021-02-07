package week13d05;

import java.util.HashSet;
import java.util.Set;

public class UniqueLetters {

    public int uniqueLetterCounter(String word) {
        Set<Character> result = new HashSet<>();
        for(Character c : word.toLowerCase().toCharArray()) {
            if(checkLetter(c)) {
                result.add(c);
            }
        }
        return result.size();
    }

    private boolean checkLetter(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static void main(String[] args) {
        UniqueLetters unique = new UniqueLetters();
        int result = unique.uniqueLetterCounter("paprika");
        System.out.println(result);
    }
}

//Írj egy metódust, amely megszámolja, hogy hány különböző betű van egy szóban.
// A kis és nagybetűk közötti különbség nem számít! A space-eket, számjegyeket, stb.
// ne vegye figyelembe! Csak az angol ábécé betűit!
