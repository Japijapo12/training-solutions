package collectionsset.collectionstreeset;

import java.util.Set;
import java.util.TreeSet;

public class WordFilter {

    public Set<String> filterWords(String[] randomStrings) {
        Set<String> orderedStrings = new TreeSet<String>();
        for (String str : randomStrings) {
            orderedStrings.add(str);
        }
        return orderedStrings;
    }
}


//TreeSet alkalmazása
//Egy String tömbből akarjuk kiszűrni az egyedi elemeket, és ezeket sorba is akarjuk
//rendezni, natív order, azaz itt abc szerint.
//Használjuk ki a TreeSet rendezettségét.
// A tesztelés során megvizsgáljuk a Set várható
//méretét, valamint a kollekció első és utolsó elemét!

