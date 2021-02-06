package week14d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void createTest() {
        Student s = new Student("John");

        assertEquals("John", s.getName());
        assertEquals(0, s.getNotes().size());
    }


    //két eset, van már olyan tantárgy vagy nincs még
    @Test
    public void addNoteTest() {
        Student s = new Student("John Doe");

        s.addNote("math", 5);

        assertEquals(1, s.getNotes().size());
        assertEquals(5, s.getNotes().get("math").get(0));  //jól írja be

        s.addNote("math", 4);
        assertEquals(2, s.getNotes().get("math").size());   // jó helyre

        s.addNote("biology", 4);
        assertEquals(2, s.getNotes().size());
        assertEquals(4, s.getNotes().get("biology").get(0));
    }

}