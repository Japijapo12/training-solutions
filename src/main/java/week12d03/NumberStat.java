package week12d03;

import java.util.*;

public class NumberStat {

    public int listCounter(List<Integer> numbers) {
        Map<Integer, Integer> numCounter = new HashMap<>();

        Integer prevValue = null;
        for (int number : numbers) {

            prevValue = numCounter.get(number);
            if (prevValue == null) {
                numCounter.put(number, 1);
            } else {
                numCounter.put(number, prevValue + 1);
            }
        }
        List<Integer> uniqueList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numCounter.entrySet()) {

            if (entry.getValue() == 1) {
                uniqueList.add(entry.getKey());
            }

        }
        Collections.sort(uniqueList);
        return uniqueList.get(0);


    }


    public static void main(String[] args) {
        NumberStat numberStat = new NumberStat();
        List<Integer> numbers = List.of(1, 1, 5, 3, 4, 5, 6, 5, 6, 4, 1, 6, 5, 4);
        System.out.println(numberStat.listCounter(numbers));
    }
}

/*

Készítsd el a week12d03.NumberStat osztályt melyben legyen egy metódus, ami paraméterül vár egy egész számokból álló listát.
Add vissza azt a számot amelyik pontosan egyszer szerepel a listában.
Ha több ilyen szám van akkor a kisebbet! Ellenőrizd, hogy olyan listát fogadunk el,
ami legalább 1 elemű, ha a lista nem ilyen, dobj kivételt! pl: {1,1,5,3,4,5,6,5,6,4,1,6,5,4} A megoldás: 3

Bónusz: Módosítsd az osztályt. Legyen egy egész számokból álló lista attribútuma.
A fent megírt metódus ezen a listán dolgozzon. A lista elemeit fájlból töltsük fel.
A file úgy néz ki, hogy egy sorban három szám van vesszővel elválasztva. Tehát:
1,1,4
2,3,5
2,2,5

 */