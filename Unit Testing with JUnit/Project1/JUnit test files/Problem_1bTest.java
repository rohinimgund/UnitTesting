package Homework_5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class Problem_1bTest {

	Problem_1 prb1;
	
	@Before
	public void setUp() {
		prb1 = new Problem_1();
	}
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem_1bTest () {
		return $(
//					Parameters are: (1,2,3,4)
//							1=x, 2=one, 3=two, 4=y
//				Test case 1
				$(  5, true, 	true, 	8),
//				Test case 2
				$(  5, false, 	true, 	7),
//				Test case 3
				$(  5, false, 	false, 	5)
		);
	}
	
	@Test
	@Parameters(method="parametersForProblem_1bTest")
	public void test (int x,boolean one, boolean two, int y) {
		// Default value of a boolean in Java is false
		assertEquals(y,prb1.returnInput(x, one, two));
		}
}