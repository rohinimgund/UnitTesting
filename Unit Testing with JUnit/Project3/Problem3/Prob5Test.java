package Problem3;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)

public class Prob5Test {
	@SuppressWarnings("unused")
	private static final Object[] parametersForProb5() {
		return $(
				// Parameters are: (1,2)
				// 1=return_value, 2=x
				// Test case 1
				$(0.00, -2.1),
				// Test case 2
				$(1.90, -0.1),
				// Test case 3
				$(2.39, 3.9),
				// Test case 4
				$(0.10, 5.9),
				// Test case 5
				$(0.00, 6.0),
				// Test case 6
				$(0.00, -4.0),
				// Test case 7
				$(0.00, -2.0),
				// Test case 8
				$(2.00, 0.0),
				// Test case 9
				$(2.00, 4.0),
				// Test case 10
				$(0.00, 8.0),
				// Test case 11
				$(1.00, -1.0),
				// Test case 12
				$(6.00, 2.0),
				// Test case 13
				$(5.00, 3.0),
				// Test case 14
				$(1.00, 5.0)
				//$(0.10, -1.9),
				//$(0.00, 6.1)
				);
	}

	@Test
	@Parameters(method = "parametersForProb5")
	public void test(double return_value, double x) {
		Prob5 p5 = new Prob5();
		assertEquals(return_value, p5.calcY(x), 0.01);
	}
}
