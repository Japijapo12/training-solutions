package ArrayList;

import java.util.ArrayList;
import java.util.List;



public class Books {

    private List<String> titles = new ArrayList<>();

    public void add(String title) {
        titles.add(title);
    }

    public List<String> getTitles() {
        return titles;
    }
}
