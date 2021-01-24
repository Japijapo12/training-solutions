package ioreadbytes;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteChecker {
    public int readBytesAndFindAs(String fileName) {

        Path file = Path.of(fileName);
        int sumOfA = 0;

        try (InputStream inputStream = new BufferedInputStream(Files.newInputStream(file))) {
            byte[] buffer = new byte[1000];
            int size;
            while ((size = inputStream.read(buffer)) > 0) {
                for (int i = 0; i < size; i++) {
                    if (buffer[i] == (byte) 'a') {
                        sumOfA++;
                    }
                }

            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read file", e);
        }
        return sumOfA;
    }


}
