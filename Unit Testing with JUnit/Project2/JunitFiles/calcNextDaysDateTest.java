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

public class calcNextDaysDateTest {
	
	private calcNextDaysDate calcND1;
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProb1()
	{
		return $(
//				Parameters are: (1,2,3,4,5,6)
//				1=monthno, 2=dayno, 3=yearno, 4=monthno_res, 5=dayno_res,	6=yearno_res 				
//				Test case 1
				$(12,31,2015,1,1,2016),
//				Test case 2
				$(12,31,2016,1,1,2017),
//				Test case 3
				$(11,30,2016,12,1,2016),
//				Test case 4
				$(11,27,2016,11,28,2016),
//				Test case 5
				$(2,28,2004,2,29,2004),
//				Test case 6
				$(2,28,2017,3,1,2017),
//				Test case 7
				$(2,28,2200,3,1,2200),
//				Test case 8
				$(2,28,2000,2,29,2000),
//				Test case 9
				$(1,29,2015,1,30,2015),
//				Test case 10
				$(4,30,2016,5,1,2016),
//				Test case 11
				$(5,30,2017,5,31,2017),
//				Test case 12
				$(6,30,2017,7,1,2017),
//				Test case 13
				$(7,30,2017,7,31,2017),
//				Test case 14
				$(8,30,2017,8,31,2017),
//				Test case 15
				$(9,30,2017,10,1,2017),
//				Test case 16
				$(10,30,2017,10,31,2017),
//				Test case 17
				$(2,28,2001,3,1,2001),
//				Test case 18
				$(2,28,2399,3,1,2399)
				);
	}	
	
	@Before
	public void setUp () {
		calcND1 = new calcNextDaysDate(2000,1,1);
	}
	
		@Test
		@Parameters(method="parametersForProb1")
	public void testcalcNextDay(int monthno, int dayno, int yearno, int monthno_res, int dayno_res, int yearno_res){
			
			calcND1.setDay(dayno);
			calcND1.setMonth(monthno);
			calcND1.setYear(yearno);
			calcND1.calcNextDay();
			assertEquals(monthno_res,calcND1.getMonth());
			assertEquals(dayno_res,calcND1.getDay());
			assertEquals(yearno_res,calcND1.getYear());
		}
}
