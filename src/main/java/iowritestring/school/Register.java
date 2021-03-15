package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Register {

    public void newMark(Path file,int mark) {
        try {
            if (Files.exists(file)) {
                Files.writeString(file, mark + "\n", StandardOpenOption.APPEND);
            } else {
                Files.writeString(file, Integer.toString(mark));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not open the file", ioe);
        }
    }

        public void average(Path file) {
            try {
                List<String> myFile = Files.readAllLines(file);
                double sum = 0;
                for(String s : myFile) {
                    sum += Double.parseDouble(s);
            }
                double average = sum / myFile.size();

                Files.writeString(file, "average: " + average, StandardOpenOption.APPEND);
        }
            catch (IOException ioe) {
                throw new IllegalStateException("Can not open the file", ioe);
            }


    }
}
