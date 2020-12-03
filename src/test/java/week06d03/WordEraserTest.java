package week06d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEraserTest {

    @Test
    public void eraseWordtest() {

        WordEraser wordEraser = new WordEraser();

        String original = "alma körte banán alma körte birsalma";

        assertEquals("körte banán körte birsalma", wordEraser.eraseWord(original, "alma"));
    }
}
