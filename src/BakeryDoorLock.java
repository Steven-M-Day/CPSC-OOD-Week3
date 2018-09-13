
public class BakeryDoorLock {

	String location;

	public BakeryDoorLock(String location) {
		this.location = location;
	}

	public void locked() {
		System.out.println(location + " is Locked");
	}

	public void unlocked() {
		System.out.println(location + " is Unlocked");
	}
}
