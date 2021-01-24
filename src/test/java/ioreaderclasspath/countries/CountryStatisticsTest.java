package ioreaderclasspath.countries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountryStatisticsTest {


    private CountryStatistics countryStatistics = new CountryStatistics();


    @Test
    public void createListTest() {
        assertEquals(0, countryStatistics.getCountries().size());

        countryStatistics.getCountries().add(new Country("Test", 3));

        assertEquals(0, countryStatistics.getCountries().size());
    }


    @Test
    public void readFromFileTest() {
        assertEquals(countryStatistics.getCountries().size(), 0);
        countryStatistics.readFromFile("country.txt");

        assertEquals(8, countryStatistics.getCountries().size());

        assertEquals("Austria", countryStatistics.getCountries().get(1).getName());
        assertEquals(1, countryStatistics.getCountries().get(5).getNeighbours());
    }

    @Test
    public void numberOfCountriesTest() {
        assertEquals(0, countryStatistics.numberOFCountries());
        countryStatistics.readFromFile("country.txt");

        assertEquals(8, countryStatistics.numberOFCountries());
    }


    @Test
    public void mostBorderCountriesTest() {
        countryStatistics.readFromFile("country.txt");

        assertEquals("Germany", countryStatistics.maxNeighbours().getName());
        assertEquals(8, countryStatistics.maxNeighbours().getNeighbours());

    }
}