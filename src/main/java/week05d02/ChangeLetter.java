package week05d02;

import java.util.Arrays;
import java.util.List;

public class ChangeLetter {


    private static final String VOWELS = "aeiou";
    private static final String REPLACE_CHAR = "*";


    public String changeVowels(String text) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            String c = text.substring((i), i + 1);

            if (VOWELS.contains(c)) {
                builder.append(REPLACE_CHAR);
            } else {
                builder.append(c);
            }
        }
        return builder.toString();

    }


}
