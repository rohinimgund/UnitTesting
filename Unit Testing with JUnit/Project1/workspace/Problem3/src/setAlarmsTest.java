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
public class setAlarmsTest {

	@SuppressWarnings("unused")
	private static final Object[] parametersForsetAlarms()
	{
		return $(
//				Parameters are: (1,2,3,4,5)
//				1=fuel_level, 2=red_res, 3=yellow_res, 4=green_res, 5=chime_res 				
//				Test case 1
				$(29.9,false,false,true,true),
//				Test case 2 
				$(40.0,false,true,false,true),
//				Test case 3
				$(49.9,true,false,false,true),
//				Test case 4				
				$(50.0,false,false,false,true),
//				Test case 5
				$(15.0,false,false,true,false),
//				Test case 6
				$(0.0,false,false,true,false),
//				Test case 7
				$(15.1,false,false,true,true),
//				Test case 8
				$(30.0,false,true,false,true),
//				Test case 9
				$(40.1,true,false,false,true),
//				Test case 10
				$(100.0,false,false,false,true));
				
	}

	@Test
	@Parameters(method="parametersForsetAlarms")
	public void testSetIndicators(double fuel_level,boolean red_res,boolean yellow_res,boolean green_res,boolean chime_res) 
	{
		setAlarms alarm = new setAlarms();
		Alerts a = new Alerts();
		a.setRed_light(!red_res);
		a.setYellow_light(!yellow_res);
		a.setGreen_light(!green_res);
		a.setChime(!chime_res);
		alarm.setAlerts(fuel_level, a);
		assertEquals(red_res,a.isRed_light());
		assertEquals(yellow_res,a.isYellow_light());
		assertEquals(green_res,a.isGreen_light());
		assertEquals(chime_res,a.isChime());
	}

}
