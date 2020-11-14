package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> capsules = new ArrayList<>();

    public void addLast(String color) {
        capsules.add(color);
    }

    public List<String> getColors() {
        return capsules;
    }

    public void addFirst(String color) {
        capsules.add(0, color);
    }

    public void removeFirst() {
        capsules.remove(0);
    }

}
