package controladvanded.cars;

import java.util.ArrayList;
import java.util.List;

public class UsedCarsValidator {

    public List<String> filterLines(List<String>lines) {

        List<String> validLines = new ArrayList<>();

        for ( String line : lines) {
            String[] parts = line.split(";");

            if ( parts.length != 4) {
                continue;
            }

            if (parts[0].length() != 7) {
                continue;
            }

            int year = Integer.parseInt(parts[1]);
            if ( year <1970 || year >2019) {
                continue;
            }

            validLines.add(line);

        }
        return validLines;
    }
}


//CSV validálás
//Egy használt autó kereskedés az autók adatait CSV fájlban tárolja.
// Minden sor az alábbi szerkezetű kell legyen: rendszám;gyártási év;márka;szín.
//Például: "ABC-123;2007;Volvo;red"
//További szabályok:
//• A rendszám mindig 7 karakterből áll és van benne - karakter.
//• A gyártási év korábbi, mint 2019, de későbbi, mint 1970.
//A feladat egy olyan metódus írása, mely a valid sorokat kigyűjti.
