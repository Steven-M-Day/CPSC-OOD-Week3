
public class Oven {

	String location = "";
	int ovenSetting;
	public static final int HIGH = 2;
	public static final int MEDIUM = 1;
	public static final int LOW = 0;
 
	public Oven(String location) {
		this.location = location;
	}
  
	public void high() {
		// turns the oven setting on to high
		ovenSetting = HIGH;
		System.out.println(location + " is on high");
 
	} 

	public void medium() {
		// turns the oven setting on to medium
		ovenSetting = MEDIUM;
		System.out.println(location + " is on medium");
	}

	public void low() {
		// turns the oven setting on to low
		ovenSetting = LOW;
		System.out.println(location + " is on low");
	}
 
	public void off() {
		// turns the oven off
		ovenSetting = 0;
		System.out.println(location + " is off");
	}
 
	public int getSetting() {
		return ovenSetting;
	}
}
