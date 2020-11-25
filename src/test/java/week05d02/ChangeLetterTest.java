package week05d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeLetterTest {

    @Test
    public void testChangeLetters() {

        assertEquals("myf*rstpr*d*ct*ndt*st", new ChangeLetter().changeVowels("myfirstproductandtest"));



    }
}
