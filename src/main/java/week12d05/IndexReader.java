package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class IndexReader {

    public int wordCounter(String word) {
        //public int wordCounter(String word, BufferedReader reader)
        Path file = Path.of("src/main/resources/index.html");
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            String line;
            int counter = 0;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains(word)) {
                    counter++;
                }
            } return counter;
            }

        catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }

    }

    public static void main(String[] args) {
        IndexReader indexReader = new IndexReader();
        System.out.println(indexReader.wordCounter("koronavírus"));
    }
}
