package collectionsset.collectionshashset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class StringsHandler {

    public Set<String> filterUniqueStrings(Collection<String> strings) {
        Set<String> uniqueStrings = new HashSet<>(strings);
        return uniqueStrings;
    }

    public Set<String> selectIdenticalStrings(Set<String> strings, Set<String> anotherStrings) {
        strings.retainAll(anotherStrings);
        return strings;
    }
}

//HashSet alkalmazása
//Egy nagy elemszámú, random módon generált
//String kollekcióból akarjuk kiszűrni az egyedi elemeket,
// másrész két különböző String halmazból akarjuk kinyerni a közös elemeket.