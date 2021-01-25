package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class StringToBytes {

    public void writeAsBytes(List<String> words, Path path) {

        try (BufferedOutputStream bos = new BufferedOutputStream(Files.newOutputStream(path))) {
            for (String word : words) {
                if(!word.startsWith("_")) {
                    bos.write(word.getBytes());
                }
            }
        }
        catch(IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }
}

//Hozz létre egy StringToBytes osztályt és készíts benne egy writeAsBytes() metódust!
//A metódus a paraméterként kapott szöveg listából az "_" jellel kezdődő szövegeken kívül
//minden mást kiír a szintén paraméterül kapott path-ra bináris fájlba.
