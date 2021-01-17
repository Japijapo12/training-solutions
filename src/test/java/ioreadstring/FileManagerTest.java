package ioreadstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {

    FileManager fileManager = new FileManager("src/test/resources/human.txt");

   @Test
   public void createClassTest() {
       assertEquals("human.txt", fileManager.getFile().getFileName().toString());
    }

    @Test
    void readFromFileTest() {
        fileManager.readFromFile();
        assertEquals(4, fileManager.getHumans().size());
        assertEquals("Kovács", fileManager.getHumans().get(0).getFirstName());
    }


}