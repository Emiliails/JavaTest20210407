/**
 * 基本路径测试
 */
package tax;

import calc.Complexity;
import org.junit.*;
import util.Tool;

import static org.junit.Assert.assertEquals;

public class PersonalTaxWithPathTest {
    PersonalTax pTax = null;

    @AfterClass
    public static void afterClass() throws Exception {

    }

    @BeforeClass
    public static void beforeClass() throws Exception {

    }

    @Before
    public void setUp() throws Exception {
        pTax = new PersonalTax();
    }

    @After
    public void tearDown() throws Exception {
        pTax = null;
    }

    @Test
    public void testGetIncome0() {
        double d = pTax.getIncome("0");
        d = Tool.m1(d);
        assertEquals(0, d, 0.01);
    }

    @Test
    public void testGetIncome1() {
        double d = pTax.getIncome("2500");
        d = Tool.m1(d);
        assertEquals(2500, d, 0.01);
    }


    @Test
    public void testGetIncome2() {
        double d = pTax.getIncome("6500");
        d = Tool.m1(d);
        assertEquals(6455, d, 0.01);
    }


    @Test
    public void testGetIncome3() {
        double d = pTax.getIncome("12500");
        d = Tool.m1(d);
        assertEquals(11960, d, 0.01);
    }


    @Test
    public void testGetIncome4() {
        double d = pTax.getIncome("23500");
        d = Tool.m1(d);
        assertEquals(21210, d, 0.01);
    }


    @Test
    public void testGetIncome5() {
        double d = pTax.getIncome("35000");
        d = Tool.m1(d);
        assertEquals(30160, d, 0.01);
    }


    @Test
    public void testGetIncome6() {
        double d = pTax.getIncome("50000");
        d = Tool.m1(d);
        assertEquals(40910, d, 0.01);
    }


    @Test
    public void testGetIncome7() {
        double d = pTax.getIncome("72500");
        d = Tool.m1(d);
        assertEquals(56035, d, 0.01);
    }


    @Test
    public void testGetIncome8() {
        double d = pTax.getIncome("542500");
        d = Tool.m1(d);
        assertEquals(315785, d, 0.01);
    }
}
