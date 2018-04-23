public class Alerts {


	private boolean red_light=false;
	private boolean yellow_light=false;
	private boolean green_light=false;
	private boolean chime=false;
	
	public boolean isRed_light() {
		return red_light;
	}
	public void setRed_light(boolean red_light) {
		this.red_light = red_light;
	}
	public boolean isYellow_light() {
		return yellow_light;
	}
	public void setYellow_light(boolean yellow_light) {
		this.yellow_light = yellow_light;
	}
	public boolean isGreen_light() {
		return green_light;
	}
	public void setGreen_light(boolean green_light) {
		this.green_light = green_light;
	}
	public boolean isChime() {
		return chime;
	}
	public void setChime(boolean chime) {
		this.chime = chime;
	}	
}