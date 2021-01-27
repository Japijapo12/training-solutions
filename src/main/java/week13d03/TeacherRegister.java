package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TeacherRegister {


    private List<Teacher> data = new ArrayList<>();


    public void readFromFile(String fileName) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of(fileName))) {
            String[] block = new String[4];
            while ((block[0] = reader.readLine()) != null) {
                data.add(processBlock(reader, block));


            }
        } catch (IOException e) {
            throw new IllegalStateException("Can not read", e);
        }
    }

    private Teacher processBlock(BufferedReader reader, String[] block) throws IOException {
        for (int i = 1; i < 4; i++) {
            block[i] = reader.readLine();
        }
        return new Teacher(block[0], block[1], block[2], Integer.parseInt(block[3]));
    }


    // Írj egy metódust, ami paraméterül várja egy tanár nevét, és kiírja, hogy hány órája van egy héten.

    public int lessonPerWeek(String name) {
        int sumLessons = 0;
        for (Teacher teacher : data) {
            if (teacher.getTeachersName().equals(name)) {
                sumLessons += teacher.getLessonPerWeek();
            }
        }
        return sumLessons;
    }



}

