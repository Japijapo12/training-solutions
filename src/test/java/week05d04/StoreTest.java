package week05d04;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import week05d03.ListCounter;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @BeforeEach
    public void setUp() {
        Product product1 = new Product("babkonzerv", 2000, 01, 01);
        Product product2 = new Product("borsókonzerv", 2022, 01, 01);
        Product product3 = new Product("halkonzerv", 1918, 01, 01);
        Product product4 = new Product("virsli", 2021, 11, 27);


        Store store = new Store();
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);

    }

        @Test
        public void getExpireDateTest() {
        Store store = new Store();

        assertEquals(2, store.getNumberOfExpired() );



    }
}
