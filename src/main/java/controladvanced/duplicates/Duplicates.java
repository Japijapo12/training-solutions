package controladvanced.duplicates;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    public List<Integer> find(List<Integer> elements) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < elements.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (elements.get(i).equals(elements.get(j))) {
                    result.add(elements.get(i));
                    break;
                }
            }
        }
        return result;
    }
}

/*Szűrd ki egy List<Integer> listában a többször szereplő elemeket, és add vissza.

Több megoldás elképzelhető, egyik (nem hatékony) megoldás, hogy egy ciklusban
végigmész az elemeken, majd egy másik ciklusban pedig végigmész az összes elem előtt
lévő elemen. Ha egyezőséget találsz, átteszed az elemet egy másik listába, és szakítsd
meg a belső ciklust, különben ha egy elem háromszor ismétlődik, rosszul fog működni.

*/