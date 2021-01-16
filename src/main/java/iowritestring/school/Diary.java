package iowritestring.school;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Diary {

    private String name;
    private int mark;

    public void newMark(String name, int mark) {
        Path file = Path.of("name.txt");
        if (Files.exists(file)) {
            try {
                Files.writeString(file, mark+ "\n", StandardOpenOption.APPEND);
            }
            catch (IOException ioe) {
                throw new IllegalStateException("Can not write file", ioe);
            }
        }
        else {
            try {
                Files.writeString(file, name + ", " + mark);
            } catch (IOException ioe) {
                throw new IllegalStateException("Can not write file", ioe);
            }
        }
    }
}
