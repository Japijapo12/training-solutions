package week06d03;

import com.sun.source.tree.BreakTree;

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


}
