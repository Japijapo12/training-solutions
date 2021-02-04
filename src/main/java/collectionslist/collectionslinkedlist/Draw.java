package collectionslist.collectionslinkedlist;

import java.util.*;

public class Draw {

    private List<Integer> createNumberPool(int maxnumber) {
        List<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <=maxnumber; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        return numbers;
    }

    public Set<Integer> drawNumbers(int drawCount, int maxNumber) throws IllegalArgumentException {
        if (maxNumber <= drawCount) {
            throw new IllegalArgumentException("drawCount must be less then " + maxNumber + "!");
        }

        return new TreeSet<>(createNumberPool(maxNumber));
    }
}

//Számsorsolás
//Hasonlít a "lottósorolás" feladatra, itt is véletlen számok kihúzásáról van szó, ám más az
//implementáció. A véletlen számok létrehozása azonos is lehet, de ArrayList helyett itt
//LinkedList a konkrét implementáció. A húzásnál használjuk ki azt, hogy a kapott
//LinkedList mint Queue is kezelhető, és a Queue poll() metódusával szedhetők ki a
//nyerő számok.
//A kapott List típust át kell alakítani Queue típussá (közvetlen cast nem lehetséges!) és a
//kihúzott számok sorba rendezése TreeSet alkalmazásával történjen.
