package week05d04senior;

import java.util.Currency;

public class ProductMain {
    public static void main(String[] args) {
        System.out.println(new Product(300, "HUF").convertPrice("USD"));
        System.out.println(new Product(1, "USD").convertPrice("HUF"));
    }
}
