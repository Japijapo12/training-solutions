package exam03retake01;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {

    Map<String, Integer> owls = new HashMap<>();


    public Map<String, Integer> readFromFile(BufferedReader reader) {

        String line;
        try {
            while ((line = reader.readLine()) != null) {

                String[] parts = line.split("=");
                String county = parts[0];
                Integer owlSum = Integer.parseInt(parts[1]);

                owls.put(county, owlSum);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read line", ioe);
        }
        return owls;
    }


    public int getNumberOfOwls(String county) {

        for (Map.Entry<String, Integer> entry : owls.entrySet()) {
            return owls.get(county);
        } return 0;
    }
}


