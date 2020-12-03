package week06d04;

import week06d02.Product;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    private final List<Item> items;

    public Budget(List<Item> items) {
        this.items = new ArrayList<>(items); //ez másolat a listáról!
    }

    public List<Item> getItemsByMonth(int month) {
       if(month<1 || month >12) {
           throw new IllegalArgumentException("Invalid month supplied.");
       }

        List<Item> result = new ArrayList<>();
        for(Item item : items) {
            if(item.getMonth() == month) {
                result.add(item);

            }
        }
        return result;

    }
}
