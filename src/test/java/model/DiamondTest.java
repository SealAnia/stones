package model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class DiamondTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	Diamond diamond = new Diamond(Diamond.NAME, Diamond.COLOR, 1.5, 
			Diamond.PRICEFORUNIT, "SV");
	
	@Test
	public void test() {
		Assert.assertEquals("Diamond", Diamond.getName());
		Assert.assertEquals("white", Diamond.COLOR);
		Assert.assertEquals(11.6, Diamond.PRICEFORUNIT);
		//fail("Not yet implemented");
	}
	
	@Test
	public void countPrice() {
		double actual = diamond.countPrice();
		double expected = 174;
		Assert.assertEquals(expected, actual);
	}

}
