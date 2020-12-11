package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LabTest {

    @Test
    void TestConstructor() {
        Lab lab = new Lab("Training");

        assertEquals("Training", lab.getTitle());
    }

    @Test
    void TestConstructorWithLocalDate() {
        Lab lab = new Lab("Training", LocalDate.of(2020,12,10));

        assertEquals("Training", lab.getTitle());
        assertEquals(LocalDate.of(2020,12,10), lab.getCompletedAt());
    }

    @Test
    void IsCompleteTest() {
        Lab lab = new Lab("Training", LocalDate.of(2020,12,10));
        lab.complete();
        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.now(), lab.getCompletedAt());
    }

}
