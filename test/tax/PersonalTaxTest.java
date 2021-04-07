/**
 * 1：简单测试
 */

package tax;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import util.Tool;
import exception.TaxException;

public class PersonalTaxTest {
	PersonalTax pTax=null;
	
	@Before
	public void setUp() throws Exception {
		pTax=new PersonalTax();
	}

	@After
	public void tearDown() throws Exception {
		pTax=null;
	}

	@Test
	public void testGetIncome1() throws TaxException {	//覆盖等价类编号1
		double d=pTax.getIncome("3000.45");
		d=Tool.m1(d);
		assertEquals(3000.45, d, 0.01);
	}
	
	
}
