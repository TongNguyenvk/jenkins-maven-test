package your.package.name; // ← Sửa thành package thực tế nếu có

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the GradeConverter class.
 */
public class GradeConverterTest {

    /** Instance of the GradeConverter to be tested. */
    private GradeConverter converter;

    /** Max score for grade A. */
    private static final int SCORE_A_MAX = 100;

    /** Min score for grade A. */
    private static final int SCORE_A_MIN = 90;

    /** Score threshold for grade B. */
    private static final int SCORE_B = 80;

    /** Score threshold for grade C. */
    private static final int SCORE_C = 70;

    /** Score threshold for grade D. */
    private static final int SCORE_D = 60;

    /** Score threshold for grade E. */
    private static final int SCORE_E = 50;

    /** Invalid high score (above 100). */
    private static final int SCORE_INVALID_HIGH = 101;

    /** Invalid low score (below 0). */
    private static final int SCORE_INVALID_LOW = -10;

    /**
     * Initializes the test environment.
     */
    @Before
    public void setUp() {
        converter = new GradeConverter();
    }

    /**
     * Test for score at upper boundary of grade A.
     */
    @Test
    public void testScoreA_MaxBoundary() {
        assertEquals("A", converter.convert(SCORE_A_MAX));
    }

    /**
     * Test for score at lower boundary of grade A.
     */
    @Test
    public void testScoreA_MinBoundary() {
        assertEquals("A", converter.convert(SCORE_A_MIN));
    }

    /**
     * Test for score corresponding to grade B.
     */
    @Test
    public void testScoreB() {
        assertEquals("B", converter.convert(SCORE_B));
    }

    /**
     * Test for score corresponding to grade C.
     */
    @Test
    public void testScoreC() {
        assertEquals("C", converter.convert(SCORE_C));
    }

    /**
     * Test for score corresponding to grade D.
     */
    @Test
    public void testScoreD() {
        assertEquals("D", converter.convert(SCORE_D));
    }

    /**
     * Test for score corresponding to grade E.
     */
    @Test
    public void testScoreE() {
        assertEquals("E", converter.convert(SCORE_E));
    }

    /**
     * Test for invalid score above valid range.
     */
    @Test
    public void testInvalidScoreHigh() {
        assertEquals("Invalid", converter.convert(SCORE_INVALID_HIGH));
    }

    /**
     * Test for invalid score below valid range.
     */
    @Test
    public void testInvalidScoreLow() {
        assertEquals("Invalid", converter.convert(SCORE_INVALID_LOW));
    }
}
