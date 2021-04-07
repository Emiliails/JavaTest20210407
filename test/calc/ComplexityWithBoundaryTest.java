package calc;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class ComplexityWithBoundaryTest {
    Complexity complexity = null;

    @BeforeClass
    public static void beforeClass() throws Exception {

    }

    @AfterClass
    public static void afterClass() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        complexity = null;
    }

    @Before
    public void setUp() throws Exception {
        complexity = new Complexity();
    }

    //    边界1 0，10
    @Test
    public void testSort1() {
        int num = complexity.sort(0, 10);
        assertEquals(0, num);
    }

    //    边界2 1，0
    @Test
    public void testSort2() {
        int num = complexity.sort(1, 0);
        assertEquals(2, num);
    }

    //    边界3 1，1
    @Test
    public void testSort3() {
        int num = complexity.sort(1, 1);
        assertEquals(5, num);
    }

    //    边界4 1，2
    @Test
    public void testSort4() {
        int num = complexity.sort(1, 2);
        assertEquals(10, num);
    }

    //    边界5 1，-1
    @Test
    public void testSort5() {
        int num = complexity.sort(1, -1);
        assertEquals(10, num);
    }
}
