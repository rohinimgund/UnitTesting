public class setAlarms{

	public void setAlerts (double fuel_level, Alerts alerts) {
	
		alerts.setChime(false); alerts.setRed_light(false); alerts.setYellow_light(false); 
	                                                                                                                        alerts.setGreen_light(false);
		
		if (fuel_level<30.0)
				alerts.setGreen_light(true);
		else
			if (fuel_level<=40.0)
					alerts.setYellow_light(true);
			else
				if (fuel_level<50.0)
						alerts.setRed_light(true);
	 		
		if (fuel_level > 15.0)
			alerts.setChime(true);
	}
}