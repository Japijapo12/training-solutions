package exam03;

import java.io.BufferedReader;
import java.io.IOException;

public class Histogram {

    public String createHistogram(BufferedReader reader) {

        String line;
        StringBuilder result = new StringBuilder();

        try {
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line);
                for (int i = 0; i < number; i++) {
                    result.append("*");
                }
                result.append("\n");

            }
        } catch (
                IOException ioe) {
            throw new IllegalStateException("Can not read line", ioe);
        }
        return result.toString();

    }


}


//Olvass be egy szöveges fájlt soronként, melyben soronként számok vannak.
// Majd hozz létre egy stringet, mely ugyanennyi sort tartalmaz, és annyi csillagot ír ki egymás mellé soronkont,
// amennyi a bemeneti fájlban lévő szám.