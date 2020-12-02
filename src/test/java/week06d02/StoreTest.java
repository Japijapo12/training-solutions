package week06d02;

import org.junit.jupiter.api.Test;


import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoreTest {

    @Test
    public void getProductByCategoryNameTest() {
        Store store = new Store(Arrays.asList(
                new Product("tej", Category.DAIRY, 100),
                new Product("sajt", Category.DAIRY, 1000),
                new Product("kenyér", Category.BAKEDGOODS, 500),
                new Product("kifli", Category.BAKEDGOODS, 200),
                new Product("zsemle", Category.BAKEDGOODS, 100)

        ));

        assertEquals(2, store.getProductByCategoryName(Category.DAIRY));
        assertEquals(3, store.getProductByCategoryName(Category.BAKEDGOODS));

    }

}