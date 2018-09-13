
public class BakeryDoorUnlockCommand implements Command{

	BakeryDoorLock bakeryDoorLock;

	public BakeryDoorUnlockCommand(BakeryDoorLock bakeryDoorLock) {
		this.bakeryDoorLock = bakeryDoorLock;
	}

	public void execute() {
		bakeryDoorLock.unlocked();
	}
}
