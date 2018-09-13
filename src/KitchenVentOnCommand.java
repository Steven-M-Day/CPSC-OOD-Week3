
public class KitchenVentOnCommand implements Command{

	KitchenVent kitchenVent;

	public KitchenVentOnCommand(KitchenVent kitchenVent) {
		this.kitchenVent = kitchenVent;
	}
	public void execute() {
		kitchenVent.high();
	}
}
