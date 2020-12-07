package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static week07d01.MathAlgorithms.isPrime;

public class MathAlgorithmsTest {

    @Test
    public void isPrimeTest() {

        assertFalse(isPrime(1));
        assertTrue(isPrime(2));
        assertTrue(isPrime(3));
        assertFalse(isPrime(4));
        assertFalse(isPrime(6));

    }


}
