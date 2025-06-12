package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for GradeConverter class.
 */
public class GradeConverterTest {

    private GradeConverter converter;

    private static final int SCORE_A_MAX = 100;
    private static final int SCORE_A_MIN = 90;
    private static final int SCORE_B = 80;
    private static final int SCORE_C = 70;
    private static final int SCORE_D = 60;
    private static final int SCORE_E = 50;
    private static final int SCORE_INVALID_HIGH = 101;
    private static final int SCORE_INVALID_LOW = -10;

    @Before
    public void setUp() {
        converter = new GradeConverter();
    }

    @Test
    public void testScoreA_MaxBoundary() {
        assertEquals("A", converter.convert(SCORE_A_MAX));
    }

    @Test
    public void testScoreA_MinBoundary() {
        assertEquals("A", converter.convert(SCORE_A_MIN));
    }

    @Test
    public void testScoreB() {
        assertEquals("B", converter.convert(SCORE_B));
    }

    @Test
    public void testScoreC() {
        assertEquals("C", converter.convert(SCORE_C));
    }

    @Test
    public void testScoreD() {
        assertEquals("D", converter.convert(SCORE_D));
    }

    @Test
    public void testScoreE() {
        assertEquals("E", converter.convert(SCORE_E));
    }

    @Test
    public void testInvalidScoreHigh() {
        assertEquals("Invalid", converter.convert(SCORE_INVALID_HIGH));
    }

    @Test
    public void testInvalidScoreLow() {
        assertEquals("Invalid", converter.convert(SCORE_INVALID_LOW));
    }
}
