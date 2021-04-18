package tax;

import calc.Complexity;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PersonalTaxByParamsTest {
    PersonalTax pTax = null;

    private String input;
    private double expect;

    @Parameterized.Parameters
    public static Collection prepareData() {
        Object[][] obj = {{"0", 0}, {"2500", 2500}, {"6500", 6455}, {"12500", 11960},
                {"23500", 21210}, {"35000", 30160}, {"50000", 40910}, {"72500", 56035}, {"542500", 315785}};
        return Arrays.asList(obj);
    }
    public PersonalTaxByParamsTest(String input,double expect){
        this.input = input;
        this.expect = expect;
    }

    @AfterClass
    public static void afterClass() throws Exception {

    }

    @BeforeClass
    public static void beforeClass() throws Exception {

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
    public void testGetIncome() {
        double d = pTax.getIncome(input);
        assertEquals(expect,d,0.01);
    }
}
