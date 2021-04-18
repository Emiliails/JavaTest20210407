/**
 * 异常测试
 * 1. 标记@Rule 期望的异常
 * 2. @Test(expected=异常类.class)
 */

package calc;

import org.junit.*;
import org.junit.rules.ExpectedException;

public class CalculatorExceptionTest {
    Calculator cal = null;
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @AfterClass
    public static void afterClass() throws Exception {

    }

    @BeforeClass
    public static void beforeClass() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        cal = null;
    }

    @Before
    public void setUp() throws Exception {
        cal = new Calculator();
    }

    //    空指针异常
    @Test(expected = NullPointerException.class)
    public void testCalculateInt1() {
        cal.calculateInt(null);
    }


    //    空指针异常和异常信息
    @Test
    public void testCalculateInt2() {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("expression is null.");
        cal.calculateInt(null);
    }

    //    数字转换异常
    @Test(expected = NumberFormatException.class)
    public void testCalculateInt3() {
        cal.calculateInt("");
    }

    //    数字转换异常和异常信息
    @Test
    public void testCalculateInt4() {
        thrown.expect(NumberFormatException.class);
        thrown.expectMessage("expression is Zero Length.");
        cal.calculateInt("");
    }
}
