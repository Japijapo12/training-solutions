package ioreader.idread;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class IdManager {

    private List<String> ids = new ArrayList<>();

    public void readIdsFromFile(String IdNumbers) {

        Path file = Path.of("src/main/resources/" + IdNumbers);

        //try with resources szerkezetben
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String idNumber;
            while ((idNumber = reader.readLine()) !=null) {
                ids.add(idNumber);

            }
        }
        catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
    }


    public List<String> getIds() {
        return new ArrayList<>(ids);
    }
}
