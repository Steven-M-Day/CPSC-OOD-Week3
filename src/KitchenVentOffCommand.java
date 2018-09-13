
public class KitchenVentOffCommand implements Command{
	
	KitchenVent kitchenVent;

	public KitchenVentOffCommand(KitchenVent kitchenVent) {
		this.kitchenVent = kitchenVent;
	}
	public void execute() {
		kitchenVent.off();
	}
}
