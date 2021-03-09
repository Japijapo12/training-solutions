package covid;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public List<Citizen> loadCitizenList(BufferedReader reader) {

        List<Citizen> result = new ArrayList<>();
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String name = parts[0];
                String zip = parts[1];
                int age = Integer.parseInt(parts[2]);
                String email = parts[3];
                String taj = parts[4];

                Citizen citizen = new Citizen(name, zip, age, email, taj);

                result.add(citizen);

        }
    } catch (IOException e) {
        throw new IllegalStateException("File error", e);
    }
        return result;
}

}
