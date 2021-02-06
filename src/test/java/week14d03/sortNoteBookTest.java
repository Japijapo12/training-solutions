package week14d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sortNoteBookTest {

    @Test
    public void sortNoteBookTest() {
        ClassNotebook classNotebook = new ClassNotebook(new ArrayList<>(List.of(new Student("John"), new Student("Bill"), new Student("Jane"))));


        List<Student>result = classNotebook.sortNotebook();

        //annak ellenőrzése, hogy helyesen futott-e le a rendezés: Bill(0), Jane(1), John(2)
        //elég a rendezett lista első és utolsó tagját megnézni

        assertEquals("Bill", result.get(0).getName());
        assertEquals("John", result.get(2).getName());

        result.add((new Student("Jack Doe")));
        assertEquals("Jack Doe", result.get(3).getName());

        System.out.println(result);
        System.out.println(result.size());

        assertEquals(3, classNotebook.getStudents().size());  //miért nem 4, amikor az előző sorban ki is irattuk a méretét ??

        result.get(0).addNote("biologie", 5); // az eredeti listába nem került be a jegy
        assertEquals(1, classNotebook.getStudents().get(1).getNotes().size() );
        System.out.println(result);
    }
}
