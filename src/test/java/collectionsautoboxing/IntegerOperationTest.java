package collectionsautoboxing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerOperationTest {

    @Test
    void createListTest() {
        IntegerOperation io = new IntegerOperation();
        List<Integer> numberList = List.of(1,2,3);
        assertEquals(numberList, io.createList(1,2,3));
    }

    @Test
    public void checkElementTypeInList() {
        //Given
        List<Integer> numbers = new IntegerOperation().createList(2, 4, 6);
        //Then
        assertEquals(3, numbers.size());
        assertEquals(2, numbers.get(0));
        assertEquals(4, numbers.get(1));
    }

    @Test
    void sumIntegerListTest() {
        IntegerOperation io = new IntegerOperation();
        assertEquals(6, io.sumIntegerList(List.of(1,2,3)));
    }
    @Test
    public void checkSumValueInList() {
        //Given
        IntegerOperation abox = new IntegerOperation();
        //Then
        assertEquals(12, abox.sumIntegerList(abox.createList(2, 4, 6)));
    }

    @Test
    public void sumIntegerObjects() {
        assertEquals(12, new IntegerOperation().sumIntegerObjects(2, 4, 6));
    }
}