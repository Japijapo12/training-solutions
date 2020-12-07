package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

    /*A hitelkártya "használatba vételekor" (CreditCard osztály betöltése)
    az aktuális átváltási faktorok (Rate) feltöltésre kerülnek a CreditCard osztályba,
    egy statikus final listába (statikus inicializálás).*/

    private static final List<Rate> ACTUAL_RATES = new ArrayList<>();

    private long balance;

    public long getBalance() {
        return balance;
    }

    public CreditCard(long balance) {
        this.balance = balance;
    }

    //lekérdezzük a valuták listájából az aktuális árfolyamát a megadott valutának:
    private double getConversionRate(Currency currency) {
        for (Rate rate : ACTUAL_RATES) {
            if (rate.getCurrency() == currency) {
                return rate.getConversionFactor();
            }
        }
        return 1.0;            // ha nincs a currency listájában a megadott valuta
    }

    public CreditCard (long balance, Currency currency, List<Rate> uploadRates) {
        ACTUAL_RATES.addAll(uploadRates);
        this.balance = (long) (balance * getConversionRate(currency));
    }

    //A kiadás payment() többféle valutában is lehetséges,
    // ezeket a rendszer egész forintra konvertálja és így terheli meg a kártyát.
    // Ha nem adunk meg valutát, automatikusan forintnak veszi a terhelést.

    /*a valuta kiadáshoz megkapjuk az összeget és a valutát:
    a kivenni kívánt összeg value = összeg x árfolyam
    ezt levonjuk az egyenlegből
    */

    public boolean payment(long amount, Currency currency) {
        long value = Math.round(amount * getConversionRate(currency));
        if (value <= balance) {
            balance -= value;
            return true;
        }
        return false;
    }

    public boolean payment(long amount) {
        return payment(amount, Currency.HUF);
    }



}
