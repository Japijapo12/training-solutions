package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    List<String> wordsWithChar(List<String>words, char c) {
        List<String> result = new ArrayList<>();
            for ( String word : words) {
                for(int i=0; i < word.toCharArray().length; i++) {
                    if (word.toCharArray()[i] == 'c') {
                        result.add(word);
                    }
                }

            }
            return result;
    }


    public static void main(String[] args) {
        WordFilter wordFilter = new WordFilter();
        System.out.println(wordFilter.wordsWithChar(List.of("alma", "citrom", "cola"), 'c'));
    }
}
