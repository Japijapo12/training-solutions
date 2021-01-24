package iostringwriter;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LongwordsTest {

    Longwords longwords = new Longwords();


    @Test
    public void writeWithStringWriterTest() {
        List<String> testWords = List.of("Pseudopseudohypoparathyroidism",
                "Supercalifragilisticexpialidocious",
                "Strengths");


        String s = longwords.writeWithStringWriter(testWords);
        String[] testS = s.split("\n");
        assertEquals(3, testS.length);
        assertTrue(testS[1].contains("34"));
    }

}
