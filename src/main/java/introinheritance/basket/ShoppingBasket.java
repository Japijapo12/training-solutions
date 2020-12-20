package introinheritance.basket;

public class ShoppingBasket {

    private Basket basket = new Basket();

    public void addItem(Item item) {
        basket.addItem(item);
    }

    public void removeItem(String barcode) {
        basket.removeItem(barcode);
    }

    public double sumNettoPrice() {
        double sum = 0.0;
        for (Item item : basket.getItems()) {
            sum += item.getNettoPrice();
        }
        return sum;
    }

    public double sumTaxValue() {
        double sumValue = 0.0;
        for (Item item : basket.getItems()) {
            sumValue += item.getTaxAmount();
        }
        return sumValue;
    }

    public double sumBruttoPrice() {
        double sumBrutto = sumNettoPrice() + sumTaxValue();
        return sumBrutto;

    }

    public void checkout() {
        basket.clearBasket();
    }

    public String getMostExpensiveItem() {
        Item mostExpensiveItem = basket.getItems().get(0);
        for (Item item : basket.getItems()) {
            if ( item.getNettoPrice() > mostExpensiveItem.getNettoPrice() ) {
                mostExpensiveItem = item;
            }

        }
        return mostExpensiveItem.getBarcode();
    }

    public void removeMostExpensiveItem() {
        basket.removeItem(getMostExpensiveItem());
    }

}

