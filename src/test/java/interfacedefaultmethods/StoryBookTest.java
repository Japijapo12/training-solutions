package interfacedefaultmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoryBookTest {

    @Test
    public void ColoredPageAddTest() {

        StoryBook storyBook = new StoryBook();

        assertEquals(0, storyBook.getLength());
    }

    @Test
    public void AddPageTest() {

        StoryBook storyBook = new StoryBook();

        storyBook.addPage("page1", "#CC0000");

        assertEquals("page1", storyBook.getPage(0));
        assertEquals("#CC0000", storyBook.getColor(0));
    }
}
