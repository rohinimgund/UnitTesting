package com.uta.controllerTest;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import com.uta.controller.*;

@RunWith(JUnitParamsRunner.class)

public class countUniqueAlphaTest {

	//private countUniqueAlpha CUA1;
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProb4()
	{
		return $(
//				Parameters are: (1,2)
//				1=test, 2=expected_unique
// 				Test case 1
				$("g",1),
// 				Test case 2
				$("",0),
// 				Test case 3
				$("k",0),
// 				Test case 4
				$("gg",0),
// 				Test case 5
				$("ggg",0),
// 				Test case 6
				$("abcdefghij",10),
// 				Test case 7
				$("abcdefghijabcdefghij",0),
//				Test case 8
				$("abcdefghijabcdefghijabcdefghij",0)
//				Test case 9
//				$("abcdddd",3)
				);
	}
	
	@Test
	@Parameters(method="parametersForProb4")
	public void testcountUnique(String test, int expected_unique){
		countUniqueAlpha CUA1 = new countUniqueAlpha();
		int current_unique = CUA1.countUnique(test.toCharArray());
		assertEquals(expected_unique, current_unique);
	}
}
