package week05d04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class StoreTest {
    @Test
    public void addProductTest() {
        List<Product> testList = new ArrayList<>();
        Store store = new Store(testList);
        assertFalse(store.addProduct(new Product("babkonzerv", 2000, 01, 01)));
        assertFalse(store.addProduct(new Product("borsókonzerv", 1980, 01, 01)));
        assertTrue(store.addProduct(new Product("babkonzerv", 2021, 01, 01)));
        assertTrue(store.addProduct(new Product("sprotni", 2020, 11, 28)));


    }

    @Test
    public void getNumberOfExpiredTest() {
        List<Product> testList = new ArrayList<>();
        testList.add(new Product("sprotni",2020,10,01));
        Store store = new Store(testList);

        assertEquals(1,store.getNumberOfExpired());

        //az assertFalse és assertTrue helyett írhatjuk az assertEquals-t is:
        assertEquals(true, store.addProduct(new Product("babkonzerv", 2020,12,31)));


    }
}
