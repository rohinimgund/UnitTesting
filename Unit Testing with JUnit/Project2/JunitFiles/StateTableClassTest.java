package com.uta.controllerTest;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import com.uta.controller.*;
import com.uta.controller.StateTableClass;


@RunWith(JUnitParamsRunner.class)

public class StateTableClassTest {
	private StateTableClass STC1;

	
	@Before
	public void setUp(){
		// Test Case 1
		STC1 = new StateTableClass(5,6,StateTable.S0);
	}
	
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProb2()
	{
		return $(
//				Parameters are: (1,2,3,4,5)
//				1=CS, 2=a, 3=x, 4=y, 5=NS
//				Test Case 2
				$(StateTable.S0, true, 4, 3, StateTable.S0),
//				Test Case 3
				$(StateTable.S0, false, 3,5, StateTable.S1),
//				Test Case 4
				$(StateTable.S1, true, 2,1, StateTable.S1),
//				Test Case 5
				$(StateTable.S1, false,	4,4, StateTable.S2),
//				Test Case 6
				$(StateTable.S2, true, -2,-4, StateTable.S3),
//				Test Case 7
				$(StateTable.S2, false, 0,0, StateTable.S0),
//				Test Case 8
				$(StateTable.S3, true, 9,9, StateTable.S3),
//				Test Case 9
				$(StateTable.S3, false, 3,0, StateTable.S0)
				);
	}
				@Test
				@Parameters(method="parametersForProb2")
				public void testState(StateTable CS, boolean a, int x, int y, StateTable NS){
						STC1.setCurrentState(CS);
						STC1.nextState(a);
						assertEquals(x, STC1.getX());
						assertEquals(y, STC1.getY());
						assertEquals(NS, STC1.getNextState());				
				}
				
				
				
				
}
