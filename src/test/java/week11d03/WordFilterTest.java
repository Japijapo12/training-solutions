package week11d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    public void wordsWithChar() {
        WordFilter wordFilter = new WordFilter();

        assertEquals(2,wordFilter.wordsWithChar(List.of("alma", "citrom", "cola"), 'c').size());
    }
}