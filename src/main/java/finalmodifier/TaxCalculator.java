package finalmodifier;

public class TaxCalculator {

    public static final double AFA = 0.27;

    //nettot számolja
    double tax(double price) {
        return price / (1 + AFA);
    }

    double priceWithTax(double nettoPrice) {
        return nettoPrice * (1 + AFA);
    }


    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();

        System.out.println(calculator.tax(1000));
        System.out.println(new TaxCalculator().priceWithTax(1000));
    }

}




//Írj egy finalmodifier.TaxCalculator osztályt, mely tartalmazza az ÁFA értékét, ami
//27%. Írj egy double tax(double price) metódust, mely a paraméterként megadott
//érték ÁFA értékét számolja, és egy double priceWithTax(double) metódust, mely az
//árat adja vissza az ÁFÁ-val együtt!