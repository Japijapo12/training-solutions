package week04d02;

import java.util.ArrayList;
import java.util.List;

public class CharOperation {
    private String base = "alma";

    public List<Integer> getPositionOfChar(String base, char part) {
        List<Integer> found = new ArrayList<>();
        for (int i = 0; i <= base.length(); i++) {
            if (base.charAt(i) == part) {
                found.add(i);

            }
        }
        return found;
    }
}
