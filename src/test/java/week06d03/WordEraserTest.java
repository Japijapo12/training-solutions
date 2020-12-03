package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEraserTest {

    @Test
    public void eraseWordTest() {

        WordEraser wordEraser = new WordEraser();

        String original = "alma körte banán alma körte birsalma";

        assertEquals("körte banán körte birsalma", wordEraser.eraseWord(original, "alma"));
    }



    //másik megoldás Scanner-rel
    @Test
    public void eraseWordWithScannerTest() {

        WordEraser wordEraser = new WordEraser();

        String original = "alma körte banán alma körte birsalma";

        assertEquals("körte banán körte birsalma", wordEraser.eraseWordsWithScanner(original, "alma"));
    }

}




