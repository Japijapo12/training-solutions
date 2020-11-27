package week05d04senior;

import java.util.Currency;

public class Product {
    private long price;
    private String currency;
    int exchangerate = 300;

    public Product(long price, String currency) {
        this.price = price;
        this.currency = currency;
        checkCurrency(currency);

    }

    public double convertPrice(String currency) {
        checkCurrency(currency);
        if (this.currency.equals("HUF") && currency.equals("USD")) {
            return price / 300;
        }
        if (this.currency.equals("USD") && currency.equals("HUF")) {
            return price * 300;
        }
        return price;
    }


    private void checkCurrency(String currency) {
        boolean valid = "HUF".equals(currency) || "USD".equals(currency);
        if (!valid) {
            throw new IllegalArgumentException(String.format("Currency (%s) can only be HUF or USD.", currency));
        }
    }


    public static void main(String[] args) {
        Product product = new Product(150, "HUF");
        System.out.println(product.convertPrice("USD"));
    }
}
