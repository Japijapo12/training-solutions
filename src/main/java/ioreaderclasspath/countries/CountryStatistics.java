package ioreaderclasspath.countries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countries = new ArrayList<>();

    public void readFromFile(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(CountryStatistics.class.getResourceAsStream("/country.txt")))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] nameAndNeighbour = line.split(" ");
                Country country = new Country(nameAndNeighbour[0], Integer.parseInt(nameAndNeighbour[1]));
                countries.add(country);
            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }

    public int numberOFCountries(){
        return countries.size();
    }

    public Country maxNeighbours() {
        Country max = countries.get(0);
        for( Country country : countries) {
            if(country.getNeighbours() >max.getNeighbours()) {
                max = country;
            }
        }
        return max;
    }

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }
}
