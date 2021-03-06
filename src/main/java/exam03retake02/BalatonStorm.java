package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class BalatonStorm {


    private List<String> stormStations = new ArrayList<>();

    public List<String> getStationsInStorm(BufferedReader reader) throws IOException {
        String line;
        String station = null;
        while ((line = reader.readLine())  != null) {
            if (line.contains("allomas")) {
                station = line.substring(line.indexOf(": \"") + 3, line.lastIndexOf("\""));
            }
            if (line.contains("\"level\": 3,")) {
                stormStations.add(station);
            }
        }
        stormStations.sort(Collator.getInstance(new Locale("hu", "HU")));
        return stormStations;
    }



}

/*
Írj egy programot, mely kilistázza, hogy hol van vihar! Ábécésorrendbe rendezve!
A BalatonStorm osztály getStationsInStorm() metódusát implementáld!
Paraméterként kap egy BufferedReader-t, és visszaadja az állomások listáját.
A fájl a következő formátumú.
[
  {
    "id": 5,
    "allomas": "Siófok (OMSZ)",
    "lat": "46.910647",
    "lng": "18.040237",
    "description": "A közforgalmú MAHART kikötőtől délnyugatra kb. 200 méterre",
    "level": 0,
    "groupId": "BE",
    "stationType": "LED"
  },
  {
    "id": 6,
    "allomas": "Siófok-H. Erzsébet",
    "lat": "46.91567",
    "lng": "18.06600000000003",
    "description": "Hotel Erzsébet szálló tetején.",
    "level": 0,
    "groupId": "BE",
    "stationType": "LED"
  }
]
 */
