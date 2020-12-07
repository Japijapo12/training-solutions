package initializer;

public class Rate {

    private Currency currency;

    private double conversionFactor;

    /*A Rate osztály az egyes valutákhoz (Currency enum) tartozó átváltási faktorokat tárolja,
    ezek listájából dolgozik a payment() metódus. --> CreditCard.java
    Hozzuk létre a Currency enum-ot is HUF, EUR, SFR, GBP, USD értékekkel! --> Currency.java
    lista ezekből az attribútumokból!!!
     */
    public Rate(Currency currency, double conversionFactor) {
        this.currency = currency;
        this.conversionFactor = conversionFactor;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getConversionFactor() {
        return conversionFactor;
    }
}

