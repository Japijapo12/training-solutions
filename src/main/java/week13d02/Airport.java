package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Airport {

    private List<Airplane> airplanes = new ArrayList<>();

    //fájl beolvasása
    public void airplainReader() {
        Path file = Path.of("airport.txt");
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] linePart = line.split(" ");
                Airplane airplane = new Airplane(linePart[0], linePart[1], linePart[2], LocalDate.parse(linePart[3]));
                airplanes.add(airplane);
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file!", e);
        }
    }

    public List<Airplane> getAirplanes() {
        return new ArrayList<>(airplanes);
    }

    //Határozd meg, hogy induló vagy érkező járatból volt-e több.

    public String typeCounter() {
        int arrivals = 0;
        int departures = 0;
        for (Airplane airplane : airplanes) {
            if (airplane.getType().equals("Arrival")) {
                arrivals++;
            } else departures++;
        }
        return arrivals > departures ? "More Arrivals" : "More Departures";
    }

    //Legyen egy metódus ami járatszám alapján ad vissza egy repülőt.

    public Airplane nameFinder(String name) {
        for (Airplane airplane : airplanes) {
            if (airplane.getName().equals(name)) {
                return airplane;
            }
        }
        throw new IllegalStateException("No airplain found with this name:" + name);

    }


    //Írj egy metódust ami bekér egy várost és azt,
    // hogy az induló vagy érkező járatokat szeretnénk-e.
    // És egy Listába adjuk vissza az összes abba a városba induló/érkező repülőt.


    public List<Airplane> findFlightByCityAndType(String city, String type) {
        List<Airplane> flights = new ArrayList<>();
        for (Airplane airplane : flights) {
            if(airplane.getCity().equals(city) && airplane.getType().equals(type)) {
                flights.add(airplane);
            }
        }
        if(flights.size() > 0) {
            return flights;
        }
        throw new IllegalStateException("Fly not found");
    }


    //Adjuk vissza a legkorábban induló repülőt!

    public Airplane searchEarliestFlight() {
        Airplane earliestFlight = airplanes.get(0);

        for (Airplane airplane : airplanes) {
            if ( airplane.getDate().equals("Departure")  && airplane.getDate().isBefore(earliestFlight.getDate())) {
                earliestFlight = airplane;
            }
        }
        return earliestFlight;
    }

}







//FC5354 Arrival Dublin 18:16
//KH2442 Departure Berlin 15:54
//ID4963 Departure Amsterdam 15:22
//CX8486 Arrival Brussels 10:37
//EJ9251 Departure  Toronto 11:30
//KJ7245 Departure Bern 6:18
//JN6048 Arrival Moscow 18:39
//MN5047 Arrival Athens 9:35