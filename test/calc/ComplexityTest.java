package calc;

import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * 基本路径测试
 * 4种测试路径
 */

public class ComplexityTest {
    Complexity complexity = null;

    @AfterClass
    public static void afterClass() throws Exception {

    }

    @BeforeClass
    public static void beforeClass() throws Exception {

    }

    @Before
    public void setUp() throws Exception {
        complexity = new Complexity();
    }

    @After
    public void tearDown() throws Exception {
        complexity = null;
    }

    @Test
//    第1条基本路径
    public void testSort1() {
        int num = complexity.sort(-1, 10);
        assertEquals(0, num);
    }

    @Test
//    第2条基本路径
    public void testSort2() {
        int num = complexity.sort(1, 0);
        assertEquals(2, num);
    }

    @Test
//    第3条基本路径
    public void testSort3() {
        int num = complexity.sort(2, 1);
        assertEquals(5, num);
    }

    @Test
//    第4条基本路径
    public void testSort4() {
        int num = complexity.sort(3, 2);
        assertEquals(10, num);
    }
}
