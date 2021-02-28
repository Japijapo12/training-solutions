package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter2 {

    Map<String, Integer> owls = new HashMap<>();

//fejlécben kell kivételkezelést továbbdobni, majd a teszteset lekezeli --> nem kell try-catch szerkezet
    public Map<String, Integer> readFromFile(BufferedReader reader) throws IOException {

        String line;
        while ((line = reader.readLine()) != null) {

                String[] parts = line.split("=");
                String county = parts[0];
                Integer owlSum = Integer.parseInt(parts[1]);

                owls.put(county, owlSum);
            }
        return owls;
    }

    public int getNumberOfOwls(String county) {

        return owls.get(county);        // for (Map.Entry<String, Integer> entry : owls.entrySet()) {  NEM KELL CIKLUS!!!

    }


// az owls.txt fájlt itt keresi: resources/azonos nevű könyvtár/owls.txt
    public static void main(String[] args) {
        OwlCounter owlCounter = new OwlCounter();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(OwlCounter.class.getResourceAsStream("/owls.txt")))) {
            owlCounter.readFromFile(reader);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read", ioe);
        }
    }

}


