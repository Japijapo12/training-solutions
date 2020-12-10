package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DogTest {

    @Test
    public void getNameTest() {


        final String name = "Bodri";
        Dog dog = new Dog();
        dog.setName(name);

        assertEquals(name, dog.getName());
    }

    @Test
    public void isPedigreeTest(){
        Dog dog = new Dog();
        dog.setPedigree(true);

        assertTrue(dog.isPedigree());

    }


}

