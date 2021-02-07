package stringbuilder;

public class Palindroma {

    public boolean isPalindrome(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Text must not be null!");
        }
        text = text.trim();

        StringBuilder sb = new StringBuilder(text);
        return text.equalsIgnoreCase(sb.reverse().toString());

        //equalsIgnoreCase() metódus összehasonlít két stringet, úgy, hogy nem veszi figyelembe, hogy nagy v. kisbetű!
    }
}

//Készítsünk olyan osztályt, amelynek metódusa egy szóról, szövegrészletről el tudja
//dönteni, hogy az palindróm (visszafelé is ugyanaz).
