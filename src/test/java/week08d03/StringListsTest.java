package week08d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {

    @Test
    public void unionTest() {
        List<String> first = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> second = Arrays.asList("a", "d", "e");
        StringLists stringLists = new StringLists();

        assertEquals(Arrays.asList("a", "b", "c", "d", "e"), stringLists.stringListsUnion(first, second));

    }
}
