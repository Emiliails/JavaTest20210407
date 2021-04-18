/**
 * 异常测试
 */
package tax;

import exception.TaxException;
import org.junit.*;
import org.junit.rules.ExpectedException;

public class PersonalTaxExceptionTest {
    PersonalTax pTax = null;
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @AfterClass
    public static void afterClass() throws Exception{

    }

    @BeforeClass
    public static void beforeClass() throws Exception{

    }

    @After
    public void tearDown() throws Exception{
        pTax = null;
    }

    @Before
    public void setUp() throws Exception{
        pTax = new PersonalTax();
    }

    @Test
    public void testGetIncome1(){
        thrown.expect(TaxException.class);
        thrown.expectMessage("税前工资金额必须输入数字");
        pTax.getIncome("*");
    }

    @Test
    public void testGetIncome2(){
        thrown.expect(TaxException.class);
        thrown.expectMessage("税前工资金额不能小于0");
        pTax.getIncome("-1");
    }

    @Test
    public void testGetIncome3(){
        thrown.expect(TaxException.class);
        thrown.expectMessage("税前工资金额不能大于100万");
        pTax.getIncome("1000001");
    }

}
