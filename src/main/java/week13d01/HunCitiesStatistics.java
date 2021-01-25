package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class HunCitiesStatistics {


    public String findCityWithMaxLength(BufferedReader reader) {

        String maxCityName = "";

        try {
            String line;
            skipHeader(reader);
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String name = parts[1];
                //System.out.println(name);
                if (name.length() > maxCityName.length()) {
                    maxCityName = name;
                }
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
        return maxCityName;

    }

    private void skipHeader(BufferedReader bufferedReader) throws IOException {
        bufferedReader.readLine();
    }



    public static void main(String[] args) {
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of("src/main/resources/iranyitoszamok-varosok-2021.csv"))){
            String city = new HunCitiesStatistics().findCityWithMaxLength(bufferedReader);
            System.out.println(city);

        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
