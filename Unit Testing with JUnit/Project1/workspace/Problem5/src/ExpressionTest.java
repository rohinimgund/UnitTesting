import static org.junit.Assert.*;

/*import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;*/
import org.junit.Test;

import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class ExpressionTest {

		@SuppressWarnings("unused")
		private static final Object[] parametersForExpression(){
			return $(
//					Parameters are: (1,2)
//									1=return_value, 2=x
//					Test case 1
				   $(0.00,-2.1),
//					Test case 2
				   $(1.90,-0.1),
//					Test case 3
				   $(2.39,3.9),
//					Test case 4
				   $(0.10,5.9),
//					Test case 5
				   $(0.00,6.0),
//					Test case 6
				   $(0.00,-4.0),
//					Test case 7
				   $(0.00,-2.0),
//					Test case 8
				   $(2.00,0.0),
//					Test case 9
				   $(2.00,4.0),
//					Test case 10 
				   $(0.00,8.0),
//					Test case 11
				   $(1.00,-1.0),
//					Test case 12
				   $(6.00,2.0),
//					Test case 13
				   $(5.00,3.0),
//					Test case 14
				   $(1.00,5.0)
				   );
	}
		

	@Test
	@Parameters(method="parametersForExpression")
	public void test(double return_value, double x){
		Expression E = new Expression();
		assertEquals(return_value,E.calcY(x),0.01);
	}
	}
