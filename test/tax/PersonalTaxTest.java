/**
 * 1：简单测试
 */

package tax;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import util.Tool;

public class PersonalTaxTest {
    PersonalTax pTax = null;

    @Before
    public void setUp() throws Exception {
        pTax = new PersonalTax();
    }

    @After
    public void tearDown() throws Exception {
        pTax = null;
    }

    @Test
    //覆盖等价类编号1
    public void testGetIncome1() {
        double d = pTax.getIncome("2500");
        d = Tool.m1(d);
        assertEquals(2500, d, 0.01);
    }

    //覆盖等价类编号2
    @Test
    public void testGetIncome2() {
        double d = pTax.getIncome("6500");
        d = Tool.m1(d);
        assertEquals(6455, d, 0.01);
    }

    //覆盖等价类编号3
    @Test
    public void testGetIncome3() {
        double d = pTax.getIncome("12500");
        d = Tool.m1(d);
        assertEquals(11960, d, 0.01);
    }

    //覆盖等价类编号4
    @Test
    public void testGetIncome4() {
        double d = pTax.getIncome("23500");
        d = Tool.m1(d);
        assertEquals(21210, d, 0.01);
    }

    //覆盖等价类编号5
    @Test
    public void testGetIncome5() {
        double d = pTax.getIncome("35000");
        d = Tool.m1(d);
        assertEquals(30160, d, 0.01);
    }

    //覆盖等价类编号6
    @Test
    public void testGetIncome6() {
        double d = pTax.getIncome("50000");
        d = Tool.m1(d);
        assertEquals(40910, d, 0.01);
    }

    //覆盖等价类编号7
    @Test
    public void testGetIncome7() {
        double d = pTax.getIncome("72500");
        d = Tool.m1(d);
        assertEquals(56035, d, 0.01);
    }

    //覆盖等价类编号8
    @Test
    public void testGetIncome8() {
        double d = pTax.getIncome("542500");
        d = Tool.m1(d);
        assertEquals(315785, d, 0.01);
    }


}
