package week06d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BiscuitTest {

    @Test
    public void BiscuitTest() {


        Biscuit biscuit = new Biscuit(BiscuitType.ZIEGLER, 25);

        assertEquals("ZIEGLER 25", biscuit.of(BiscuitType.ZIEGLER, 25).toString());

    }
}