package interfacedefaultmethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrinterTest {

    @Test
    public void printNewsPaper() {

        Newspaper newspaper = new Newspaper();
        newspaper.addPage("page1");

        Printer printer = new Printer();

        assertEquals("page1\n", printer.print(newspaper));
    }

    @Test
    public void printStoryBook() {
        StoryBook storyBook = new StoryBook();
        storyBook.addPage("Page1", Printable.BLACK);
        storyBook.addPage("Page2", "#ff0000");

        assertEquals("Page1\n[#ff0000]Page2\n", new Printer().print(storyBook));
    }

}
