package Homework_5;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem_5Test {

	Problem_5 prb5;
	
	@Before
	public void setUp() throws Exception {
		prb5 = new Problem_5();
	}

	@SuppressWarnings("unused")
	private static final Object[] parametersForMathExpressionClass () {
		return $(
//					Parameters are: (1,2)
//							1=x, 2=y (expected output)
//				Test case 1
				$(	-2.1,		0.0),
//				Test case 2
				$(   -0.1,		1.9),
//				Test case 3
				$(   3.9,		2.39),
//				Test case 4
				$(   5.9,		0.10),
//				Test case 5
				$(   6.0,		0.0),
//				Test case 6
				$(   -4.0,		0.0),
//				Test case 7
				$(   -2.0,		0.0),
//				Test case 8
				$(   0.0,		2.0),
//				Test case 9
				$(   4.0,		2.0),
//				Test case 10
				$(   8.0,		0.0),
//				Test case 11
				$(   -1.0,		1.0),
//				Test case 12
				$(    2.0,		6.0),
//				Test case 13
				$(   3.0,		5.0),
//				Test case 14
				$(   5.0,		1.0)
		);
	}
	
	@Test
	@Parameters(method="parametersForMathExpressionClass")
	public void test(double x, double y) {
		assertEquals(y,prb5.calcY(x),0.01);
	}
}