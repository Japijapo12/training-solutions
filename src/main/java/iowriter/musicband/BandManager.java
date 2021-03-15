package iowriter.musicband;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class BandManager {

    //Path file = Path.of("bands_and_years.txt");

    List<Band> bands = new ArrayList<>();

    public List<Band> readBandsFromFile(Path file) {
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] lineparts = line.split(",");
                String name = lineparts[0];
                int year = Integer.parseInt(lineparts[1]);
                Band band = new Band(name, year);
                bands.add(band);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return bands;
    }

    public List<Band> getBands() {
        return new ArrayList<>(bands);
    }

    public void writeBandsBefore(Path resultFile, int year) {
        try (BufferedWriter writer = Files.newBufferedWriter(resultFile)) {
            for (Band band : searcherByYear(year)) {
                writer.write(band.getName() + ", " + band.getYear() + "\n");
        }
    } catch(
    IOException e) {
        throw new IllegalStateException("Can not read file, e");
    }

}


    private List<Band> searcherByYear(int year) {
        List<Band> result = new ArrayList<>();
        for (Band band : bands ) {
            if (band.getYear() > year) {
                result.add(band);
            }
        }
        return result;
    }




}
