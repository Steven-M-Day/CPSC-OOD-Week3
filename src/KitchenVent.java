
public class KitchenVent {
	
	String location = "";
	int ventSetting;
	public static final int HIGH = 2;
	public static final int MEDIUM = 1;
	public static final int LOW = 0;
 
	public KitchenVent(String location) {
		this.location = location;
	}
  
	public void high() {
		// turns the vent setting on to high
		ventSetting = HIGH;
		System.out.println(location + " is on high");
 
	} 

	public void medium() {
		// turns the vent setting on to medium
		ventSetting = MEDIUM;
		System.out.println(location + " is on medium");
	}

	public void low() {
		// turns the vent setting on to low
		ventSetting = LOW;
		System.out.println(location + " is on low");
	}
 
	public void off() {
		// turns the vent off
		ventSetting = 0;
		System.out.println(location + " is off");
	}
 
	public int getSetting() {
		return ventSetting;
	}
}
