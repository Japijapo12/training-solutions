package ioreadstring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path file;
    private List<Human> humans = new ArrayList<>();

    public FileManager(String filePath) {
        this.file = Path.of(filePath);
    }

    public void readFromFile() {

        try {
            List<String> filePath = Files.readAllLines(file);
            for (String s : filePath) {
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

    public static void main(String[] args) {
        System.out.println(new FileManager("src/test/resources/human.txt").getHumans().get(0));
    }
}
