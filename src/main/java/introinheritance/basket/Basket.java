package introinheritance.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String barcode) {

        Item toDelete = null;
        for (Item item : items) {
            if (item.getBarcode().equals(barcode)) {
                toDelete = item;
            }
        }
        items.remove(toDelete);
    }

    public List<Item> getItems() {
        return items;
    }

    public void clearBasket() {
        items.clear();
    }
}


