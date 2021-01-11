package ioreadstring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path file;
    private List<Human> humans = new ArrayList<>();

    public FileManager(String fileRelativePath) {
        this.file = Path.of(fileRelativePath);
    }


    public void readFromFile() {

        try {
            List<String> fileInString = Files.readAllLines(file);
            for (String s : fileInString) {
                String firstAndLast[] = s.split(" ");
                Human human = new Human(firstAndLast[0], firstAndLast[1]);
                humans.add(human);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);

        }
    }

    public Path getFile() {
        return file;
    }

    public List<Human> getHumans() {
        return new ArrayList<>(humans);
    }
}
