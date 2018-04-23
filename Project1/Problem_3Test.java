package Homework_5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junitparams.JUnitParamsRunner;

import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class Problem_3Test {

	Problem_3 prb3;
	Problem3Class alerts;
	
	@Before
	public void setUp() {
		prb3 = new Problem_3();
		alerts = new Problem3Class();
	}
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem_3Test () {
		return $(
				/*					Parameters are: (1,2,3,4,5)
				1=fuel_level, 2=red, 3=yellow, 4=green, 5=chime
				Note that the last 4 above are just the expected outputs - the code below complements 
				 the expected outputs for the inputs
*/
//				Test case 1
				$(  29.9, false, 	false, 	true,	true),
//				Test case 2
				$(  40.0, false, 	true, 	false,	true),
//				Test case 3
				$(  49.9, true, 	false, 	false,	true),
//				Test case 4
				$(  50.0, false, 	false, 	false,	true),
//				Test case 5
				$(  15.0, false, 	false, 	true,	false),
//				Test case 6
				$(  0.0,  false, 	false, 	true,	false),
//				Test case 7
				$(  15.1, false, 	false, 	true,	true),
//				Test case 8
				$(  30.0, false, 	true, 	false,	true),
//				Test case 9
				$(  40.1, true, 	false, 	false,	true),
//				Test case 10
				$(  100.0,false, 	false, 	false,	true)
		);
	}
	
	@Test
	@Parameters(method="parametersForProblem_3Test")
	public void test (double fuel_level,boolean red_light, boolean yellow_light, boolean green_light, boolean chime) {
		alerts.setRed_light(!red_light);
		alerts.setYellow_light(!yellow_light);
		alerts.setGreen_light(!green_light);
		alerts.setChime(!chime);
		// Default value of a boolean in Java is false
		prb3.setAlerts(fuel_level, alerts);
		assertEquals(red_light,alerts.isRed_light());
		assertEquals(yellow_light,alerts.isYellow_light());
		assertEquals(green_light,alerts.isGreen_light());
		assertEquals(chime,alerts.isChime());
		}
}
