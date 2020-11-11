package week02;

import java.util.ArrayList;
import java.util.List;

public class Languages {

    public static void main(String[] args) {

        List<String> proglanguages = new ArrayList<>();
        proglanguages.add("Java");
        proglanguages.add("Python");
        proglanguages.add("JavaScript");

        for (String language : proglanguages) {
            if (language.length() > 5) {
                System.out.println(language);
            }
        }

    }


}