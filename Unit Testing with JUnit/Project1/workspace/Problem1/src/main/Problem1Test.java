package main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Problem1Test {

	static Problem1 problem = null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		problem = new Problem1();
	}
//	Test 1
	@Test
	public void testReturnInput_True_True() {
		int x = 5;
		int y = 8;
		boolean one = true;
		boolean two = true;
		org.junit.Assert.assertEquals(y, problem.returnInput(x, one, two));
	}
//	Test 2
	@Test
	public void testReturnInput_False_True() {
		int x = 5;
		int y = 7;
		boolean one = false;
		boolean two = true;
		org.junit.Assert.assertEquals(y, problem.returnInput(x, one, two));
	}
	
//	Test 3	
	@Test
	public void testReturnInput_False_False() {
		int x = 5;
		int y = 5;
		boolean one = false;
		boolean two = false;
		org.junit.Assert.assertEquals(y, problem.returnInput(x, one, two));
	}

}
