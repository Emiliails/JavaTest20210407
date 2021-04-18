package tax;

import calc.Complexity;
import exception.TaxException;
import org.junit.*;
import org.junit.rules.ExpectedException;
import util.Tool;

import static org.junit.Assert.*;

public class PersonalTaxWithBoundaryTest {
    PersonalTax pTax = null;
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @BeforeClass
    public static void beforeClass() throws Exception {

    }

    @AfterClass
    public static void afterClass() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
        pTax = null;
    }

    @Before
    public void setUp() throws Exception {
        pTax = new PersonalTax();
    }

    @Test
    public void testGetIncome1(){
        thrown.expect(TaxException.class);
        thrown.expectMessage("税前工资金额不能小于0");
        pTax.getIncome("-0.01");
    }

    @Test
    public void testGetIncome2(){
        double d = pTax.getIncome("0");
        d = Tool.m1(d);
        assertEquals(0,d,0.01);
    }

    @Test
    public void testGetIncome3(){
        double d = pTax.getIncome("0.01");
        d = Tool.m1(d);
        assertEquals(0,d,0.01);
    }

    @Test
    public void testGetIncome4(){
        double d = pTax.getIncome("2500");
        d = Tool.m1(d);
        assertEquals(2500,d,0.01);
    }

    @Test
    public void testGetIncome5(){
        double d = pTax.getIncome("4999.99");
        d = Tool.m1(d);
        assertEquals(4999.99,d,0.01);
    }

    @Test
    public void testGetIncome6(){
        double d = pTax.getIncome("5000");
        d = Tool.m1(d);
        assertEquals(5000,d,0.01);
    }

    @Test
    public void testGetIncome7(){
        double d = pTax.getIncome("5000.01");
        d = Tool.m1(d);
        assertEquals(5000.01,d,0.01);
    }

    @Test
    public void testGetIncome8(){
        double d = pTax.getIncome("6500");
        d = Tool.m1(d);
        assertEquals(6455,d,0.01);
    }

    @Test
    public void testGetIncome9(){
        double d = pTax.getIncome("7999.99");
        d = Tool.m1(d);
        assertEquals(7909.99,d,0.01);
    }

    @Test
    public void testGetIncome10(){
        double d = pTax.getIncome("8000");
        d = Tool.m1(d);
        assertEquals(7910.0,d,0.01);
    }

    @Test
    public void testGetIncome11(){
        double d = pTax.getIncome("8000.01");
        d = Tool.m1(d);
        assertEquals(7910.01,d,0.01);
    }

    @Test
    public void testGetIncome12(){
        double d = pTax.getIncome("12500");
        d = Tool.m1(d);
        assertEquals(11960,d,0.01);
    }

    @Test
    public void testGetIncome13(){
        double d = pTax.getIncome("16999.99");
        d = Tool.m1(d);
        assertEquals(16009.99,d,0.01);
    }
    @Test
    public void testGetIncome14(){
        double d = pTax.getIncome("17000");
        d = Tool.m1(d);
        assertEquals(16010.0,d,0.01);
    }
    @Test
    public void testGetIncome15(){
        double d = pTax.getIncome("17000.01");
        d = Tool.m1(d);
        assertEquals(16010.01,d,0.01);
    }
    @Test
    public void testGetIncome16(){
        double d = pTax.getIncome("23500");
        d = Tool.m1(d);
        assertEquals(21210,d,0.01);
    }
    @Test
    public void testGetIncome17(){
        double d = pTax.getIncome("29999.99");
        d = Tool.m1(d);
        assertEquals(26409.99,d,0.01);
    }
    @Test
    public void testGetIncome18(){
        double d = pTax.getIncome("30000");
        d = Tool.m1(d);
        assertEquals(26410,d,0.01);
    }
    @Test
    public void testGetIncome19(){
        double d = pTax.getIncome("30000.01");
        d = Tool.m1(d);
        assertEquals(26410.01,d,0.01);
    }
    @Test
    public void testGetIncome20(){
        double d = pTax.getIncome("35000");
        d = Tool.m1(d);
        assertEquals(30160,d,0.01);
    }
    @Test
    public void testGetIncome21(){
        double d = pTax.getIncome("39999.99");
        d = Tool.m1(d);
        assertEquals(33909.99,d,0.01);
    }
    @Test
    public void testGetIncome22(){
        double d = pTax.getIncome("40000");
        d = Tool.m1(d);
        assertEquals(33910,d,0.01);
    }
    @Test
    public void testGetIncome23(){
        double d = pTax.getIncome("40000.01");
        d = Tool.m1(d);
        assertEquals(33910.01,d,0.01);
    }
    @Test
    public void testGetIncome24(){
        double d = pTax.getIncome("50000");
        d = Tool.m1(d);
        assertEquals(40910,d,0.01);
    }
    @Test
    public void testGetIncome25(){
        double d = pTax.getIncome("59999.99");
        d = Tool.m1(d);
        assertEquals(47909.99,d,0.01);
    }
    @Test
    public void testGetIncome26(){
        double d = pTax.getIncome("60000");
        d = Tool.m1(d);
        assertEquals(47910,d,0.01);
    }
    @Test
    public void testGetIncome27(){
        double d = pTax.getIncome("60000.01");
        d = Tool.m1(d);
        assertEquals(47910.01,d,0.01);
    }
    @Test
    public void testGetIncome28(){
        double d = pTax.getIncome("72500");
        d = Tool.m1(d);
        assertEquals(56035,d,0.01);
    }
    @Test
    public void testGetIncome29(){
        double d = pTax.getIncome("84999.99");
        d = Tool.m1(d);
        assertEquals(64159.99,d,0.01);
    }
    @Test
    public void testGetIncome30(){
        double d = pTax.getIncome("85000");
        d = Tool.m1(d);
        assertEquals(64160,d,0.01);
    }
    @Test
    public void testGetIncome31(){
        double d = pTax.getIncome("85000.01");
        d = Tool.m1(d);
        assertEquals(64160.01,d,0.01);
    }

    @Test
    public void testGetIncome32(){
        double d = pTax.getIncome("542500");
        d = Tool.m1(d);
        assertEquals(315785,d,0.01);
    }
    @Test
    public void testGetIncome33(){
        double d = pTax.getIncome("999999.99");
        d = Tool.m1(d);
        assertEquals(567409.99,d,0.01);
    }
    @Test
    public void testGetIncome34(){
        double d = pTax.getIncome("1000000");
        d = Tool.m1(d);
        assertEquals(567410,d,0.01);
    }
    @Test
    public void testGetIncome35(){
        thrown.expect(TaxException.class);
        thrown.expectMessage("税前工资金额不能大于100万");
        pTax.getIncome("1000000.01");
    }
    @Test
    public void testGetIncome36(){
        thrown.expect(TaxException.class);
        thrown.expectMessage("税前工资金额必须输入数字");
        pTax.getIncome("*");
    }


}
