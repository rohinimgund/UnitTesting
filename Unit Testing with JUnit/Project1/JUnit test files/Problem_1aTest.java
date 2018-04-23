package Homework_5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class Problem_1aTest {

	Problem_1 prb1;
	
	@Before
	public void setUp() {
		prb1 = new Problem_1();
	}
		
	@Test
	public void test () {

		// Test case 1
		assertEquals(8,prb1.returnInput(5, true, true));

		// Test case 2
		assertEquals(7,prb1.returnInput(5, false, true));

		// Test case 3
		assertEquals(5,prb1.returnInput(5, false, false));
}
}