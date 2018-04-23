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
public class CreditTest {
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForCredit()
	{
		return $(
//				Parameters are: (1,2,3,4,5)
//								1=invoice, 2=credit,3=balance, 4=interest, 5=expected
// 				Test case 1
			   $(2999.99,5000.01,1499.99,0.12,true),
//				Test case 2
			   $(3000.00,5000.01,1499.99,0.12,false),
//				Test case 3
			   $(2999.99,5000.00,1499.99,0.12,false),
//				Test case 4
			   $(2999.99,5000.01,1500.00,0.12,false),
//				Test case 5
			   $(2999.99,5000.01,1499.99,0.13,false),
//				Test case 6
			   $(0.00,5000.01,1499.99,0.12,true),
//				Test case 7
			   $(10000.00,5000.01,1499.99,0.12,false),
//				Test case 8
			   $(2999.99,0.00,1499.99,0.12,false),
//				Test case 9
			   $(2999.99,10000.00,1499.99,0.12,true),
//				Test case 10
			   $(2999.99,10000.00,10000.00,0.12,false),
//				Test case 11
			   $(2999.99,10000.00,0.00,0.12,true),
//				Test case 12
			   $(2999.99,10000.00,0.00,0.00,true),
//				Test case 13
			   $(2999.99,10000.00,0.00,0.40,false));

	}
	@Test
	@Parameters(method="parametersForCredit")
	public void test(double invoice,double credit,double balance,double interest,boolean expected)
	{
		Credit cc = new Credit();
		assertEquals(expected,cc.isCreditIncreasable(invoice,credit,balance,interest));
	}

}
