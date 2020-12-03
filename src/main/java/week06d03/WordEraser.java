package week06d03;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class WordEraser {

    public String eraseWord(String words, String word) {

        String[] newWords = words.split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        for (String nw : newWords) {
            if (!nw.equals(word)) {
                stringBuilder.append(nw + " ");
            }

        }
        return stringBuilder.toString().trim();

    }


    // másik megoldás Scanner-rel

    public String eraseWordsWithScanner(String words, String word) {
        Scanner scanner = new Scanner(words);
        StringBuilder result = new StringBuilder();

        while (scanner.hasNext()) {
            String s = scanner.next();
            if (!word.equals(s)) {
                result.append(s + " ");
            }
        }
        return result.toString().trim();
    }

}
