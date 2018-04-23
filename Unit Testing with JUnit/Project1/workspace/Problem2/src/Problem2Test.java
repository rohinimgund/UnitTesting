import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;
import junitparams.Parameters;


@RunWith(JUnitParamsRunner.class)
public class Problem2Test {
		
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem2(){
		return $(
//				Parameters are: (1,2,3,4)
//				1=x, 2=one, 3=two, 4=y

//				Test case 1				
			   $(5,true,true,3),
//				Test case 2
			   $(5,false,true,3),
// 				Test case 3
			   $(5,false,false,5));
	}
		
	@Test
	@Parameters(method="parametersForProblem2")
	public void test(int x,boolean one,boolean two,int y)
	{
		Problem2 problem = new Problem2();
		assertEquals(y, problem.returnInput(x, one, two));
	}

}
