package exam03retake01;

public class CdvCheck {

    public boolean check(String digits) {

        if (digits.length() != 10 || notNumber(digits)) {
            throw new IllegalArgumentException("Az adószámnak 10 számjegyűnek kell lennie!");
        }

        long sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += (Integer.parseInt(digits.substring(i, i + 1)) * (i+1));
            System.out.println((Integer.parseInt(digits.substring(i, i + 1)) * (i+1)) +  "=" + sum);
        }
        System.out.println(sum);

        return (sum % 11) == Integer.parseInt(digits.substring(9));
    }

//az integer tartományba nem fér bele a 10 jegyű adószám, csak a long-ba!
    private boolean notNumber(String s) {
        try {
            Long.parseLong(s);
            return false;
        }
        catch (NumberFormatException ne) {
            return true;
        }
    }
}

/*
Írj egy `CdvCheck.check()` metódust (paraméterezése, visszatérési értéke kiderül a tesztesetből),  mely kap egy adószámot, és eldönti róla, hogy helyes-e! A következőképp kell eldönteni.
Fogni kell az első kilenc számjegyet, és megszorozni rendre 1, 2, ..., 9 számmal.
Az eredményt kell összegezni, majd maradékos osztani 11-el.
A 10. számjegynek meg kell egyeznie ezzel a számmal (maradékkal).
Pl.: 8365670003
1 * 8 + 2 * 3 + 3 * 6 + ... + 9 * 0 = 124
124 maradékos osztás 11-el = 3
3 (maradék) == 3 (10. számhegy) - az adószám megfelelő
Ha a paraméterként átadott adószám nem 10 számjegy, vagy nem csak számjegy szerepel benne, `IllegalArgumentException` kivételt kell dobni.


 */