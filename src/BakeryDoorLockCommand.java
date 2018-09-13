
public class BakeryDoorLockCommand implements Command{

	BakeryDoorLock bakeryDoorLock;

	public BakeryDoorLockCommand(BakeryDoorLock bakeryDoorLock) {
		this.bakeryDoorLock = bakeryDoorLock;
	}

	public void execute() {
		bakeryDoorLock.locked();
	}
}
