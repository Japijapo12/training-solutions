package week08d03;


//Készíts egy StringLists osztályt és benne egy stringListsUnion(List<String> first, List<String> second) metódust,
// mely két string listát vár paraméterül és visszaadja az uniójukat.
// Az úniónak minden elemet tartalmaznia kell mindkét listából, de egy elem nem szerepelhet kétszer!

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> stringListsUnion(List<String> first, List<String> second) {

        List<String> result = new ArrayList<>(first); //first konstruktorban átadva
        //List<String> result = new ArrayList<>();
        //result.addAll(first);

        for (String s : second) {
            if(!result.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }



}

