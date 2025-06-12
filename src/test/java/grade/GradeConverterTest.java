package grade;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the {@link GradeConverter} class.
 * <p>
 * This class verifies the correctness of the grade conversion logic
 * by testing various valid and invalid score inputs.
 */
public class GradeConverterTest {

    /** Instance of GradeConverter to be tested. */
    private GradeConverter converter;

    /** Highest possible score for grade A. */
    private static final int SCORE_A_MAX = 100;

    /** Lowest score for grade A. */
    private static final int SCORE_A_MIN = 90;

    /** Representative score for grade B. */
    private static final int SCORE_B = 80;

    /** Representative score for grade C. */
    private static final int SCORE_C = 70;

    /** Representative score for grade D. */
    private static final int SCORE_D = 60;

    /** Representative score for grade E. */
    private static final int SCORE_E = 50;

    /** Score above the maximum valid value. */
    private static final int SCORE_INVALID_HIGH = 101;

    /** Score below the minimum valid value. */
    private static final int SCORE_INVALID_LOW = -10;

    /**
     * Initializes the GradeConverter instance before each test.
     */
    @Before
    public void setUp() {
        converter = new GradeConverter();
    }

    /**
     * Tests grade A for maximum boundary value.
     */
    @Test
    public void testScoreAMaxBoundary() {
        assertEquals("A", converter.convert(SCORE_A_MAX));
    }

    /**
     * Tests grade A for minimum boundary value.
     */
    @Test
    public void testScoreAMinBoundary() {
        assertEquals("A", converter.convert(SCORE_A_MIN));
    }

    /**
     * Tests conversion for a score in grade B range.
     */
    @Test
    public void testScoreB() {
        assertEquals("B", converter.convert(SCORE_B));
    }

    /**
     * Tests conversion for a score in grade C range.
     */
    @Test
    public void testScoreC() {
        assertEquals("C", converter.convert(SCORE_C));
    }

    /**
     * Tests conversion for a score in grade D range.
     */
    @Test
    public void testScoreD() {
        assertEquals("D", converter.convert(SCORE_D));
    }

    /**
     * Tests conversion for a score in grade E range.
     */
    @Test
    public void testScoreE() {
        assertEquals("E", converter.convert(SCORE_E));
    }

    /**
     * Tests handling of a score above the maximum allowed.
     */
    @Test
    public void testInvalidScoreHigh() {
        assertEquals("Invalid", converter.convert(SCORE_INVALID_HIGH));
    }

    /**
     * Tests handling of a score below the minimum allowed.
     */
    @Test
    public void testInvalidScoreLow() {
        assertEquals("Invalid", converter.convert(SCORE_INVALID_LOW));
    }
}
