package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products = new ArrayList<>();

    public Store(List<Product> products) {
        this.products = products;
    }

    public boolean addProduct(Product product) {
        if (!isValid(product)) {
            return false;
        } else {
            products.add(product);
            return true;
        }
    }

    private boolean containsByName(Product product) {
        for (Product item : products) {
            if (item.getName().equals(product.getName())) {
                return true;
            }
        }
        return false;
    }

    private boolean isValid(Product product) {
        return !containsByName(product) && !product.isExpired();
    }

    public int getNumberOfExpired() {
        int count = 0;
        for (Product product : products) {
            if (product.isExpired()) {
                count++;
            }
        }
        return count;
    }


}
