package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesSum {

    public int readFile(String filename) {
        //Path path = Path.of(filename);
        int number;
        try {
            String fileContent = Files.readString(Path.of(filename));
            number = Integer.parseInt(fileContent);    // a beolvasott txt fájlokban egy-egy szám van

        } catch (IOException | NumberFormatException e) {
            throw new IllegalArgumentException("Can not read the file", e);
        }
        return number;
    }


    public int sumNumbers() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            String filename = "number" + (i < 10 ? "0" + i : i) + ".txt";
             //String filename = String.format("number%02d.txt", i);

            if (Files.isRegularFile(Path.of(filename))) {
                int number = readFile(filename);
                sum += number;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new FilesSum().sumNumbers());

    }

}
