package week10d02;

import java.util.List;


//Van egy egész számok listája, amelyben egy szám azt jelzi, hogy az adott számú buszmegállóban egy ember fel akar szállni.
// A 12,12,0,3,4,4 sorozat tehát azt jelenti, hogy a 12-es buszmegállóban, ami kétszer szerepe, vagyis 2-en, akarnak felszállni.
//Vagyis ahányszor szerepel egy szám a listában, annyian akarnak felszállni.  Egy elem a listában egy felszállót jelent.


public class MaxTravel {

    public int getMaxIndex(List<Integer> numbers) {

        int[] counters = new int[30];
        for (int i :numbers) {

            counters[i]++;  // visszad egy tömböt
        }

        int index = 0;

        for (int i = 0; i <counters.length; i++) {
            if(counters[index] < counters[i]) {
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int max = new MaxTravel().getMaxIndex(List.of(3,3,12,12,0,3,4,3,3,4,12,3));
        System.out.println(max);
    }
}
