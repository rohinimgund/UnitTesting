package Problem1;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import junitparams.JUnitParamsRunner;

import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import junitparams.Parameters;


@RunWith(JUnitParamsRunner.class)
public class Problem_1Test {

	Problem_1 prb1;
	Problem1Class alerts;
	fuelTempClass mockobj;
	
	@Before
	public void setUp() {
		prb1 = new Problem_1();
		alerts = new Problem1Class();
		mockobj = EasyMock.createMock(fuelTempClass.class);
	}
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem_1Test () {
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
	@Parameters(method="parametersForProblem_1Test")
	public void test (double fuel_level,boolean red_light, boolean yellow_light, boolean green_light, boolean chime) {
		alerts.setRed_light(!red_light);
		alerts.setYellow_light(!yellow_light);
		alerts.setGreen_light(!green_light);
		alerts.setChime(!chime);
		// Default value of a boolean in Java is false
		
		EasyMock.expect(mockobj.getFuelLevel()).andReturn(fuel_level);
		EasyMock.replay(mockobj);
		prb1.setAlerts(mockobj, alerts);
		assertEquals(red_light,alerts.isRed_light());
		assertEquals(yellow_light,alerts.isYellow_light());
		assertEquals(green_light,alerts.isGreen_light());
		assertEquals(chime,alerts.isChime());
		
		EasyMock.verify(mockobj);
		EasyMock.reset(mockobj);
		
		}
}
