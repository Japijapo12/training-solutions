package interfacedefaultmethods;

import java.util.ArrayList;
import java.util.List;

public class Newspaper implements Printable{

    private List<String> pages = new ArrayList<>();



    @Override
    public int getLength() {
        return pages.size();
    }

    @Override
    public String getPage(int pageNumber) {
        return pages.get(pageNumber);
    }

    public void addPage(String page) {
        pages.add(page);
    }


}
