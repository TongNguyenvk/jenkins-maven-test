import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;


public class GradeConverterTest {

    private GradeConverter  converter;

    @Before
    public void setUp() throws Exception {
        converter  = new GradeConverter();
    }

    @Test
    public void testConvert1() throws Exception {
        String expected = "A";
        String actual = converter.convert(100);
        assertEquals(expected,actual);
    }

    @Test
    public void testConvert2() throws Exception {
        String expected = "A";
        String actual = converter.convert(90);
        assertEquals(expected,actual);
    }
    @Test
    public void testConvert3() throws Exception {
        String expected = "B";
        String actual = converter.convert(80);
        assertEquals(expected,actual);
    }
    @Test
    public void testConvert4() throws Exception {
        String expected = "C";
        String actual = converter.convert(70);
        assertEquals(expected, actual);
    }
    @Test
    public void testConvert5() throws Exception {
        String expected = "D";
        String actual = converter.convert(60);
        assertEquals(expected,actual);
    }
    @Test
    public void testConvert6() throws Exception {
        String expected = "E";
        String actual = converter.convert(50);
        assertEquals(expected,actual);
    }
    @Test
    public void testConvert7() throws Exception {
        String expected = "Invalid";
        String actual = converter.convert(101);
        assertEquals(expected,actual);
    }
    @Test
    public void testConvert8() throws Exception {
        String expected = "Invalid";
        String actual = converter.convert(-10);
        assertEquals(expected,actual);
    }


}
