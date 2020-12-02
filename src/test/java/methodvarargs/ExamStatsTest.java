package methodvarargs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExamStatsTest {

    private ExamStats examStats;


    @BeforeEach
    public void setUp() {
        this.examStats = new ExamStats(100);
    }

    @AfterEach
    public void tearDown() {
        this.examStats = null;
    }
    @Test
    public void testGetNumberOfTopGrades() {

        assertEquals(2, examStats.getNumberOfTopGrades(50, 10, 30, 40, 80, 100));
    }

    @Test
    public void testHasAnyFailed() {
        assertTrue(examStats.hasAnyFailed(50, 10, 90));
        assertFalse(examStats.hasAnyFailed(50, 60, 90));

    }
}
