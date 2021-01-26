package week02d05;

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

//Hozz létre egy Languages osztályt, main metódussal! Ebben hozz létre egy listát, mely karakterláncokat tartalmaz!
// Vegyetek fel 3 elemet: Java, Python, JavaScript!
//Írd ki, az öt karakternél hosszabb programozási nyelveket!