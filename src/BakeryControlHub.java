
public class BakeryControlHub {
	
	Command[] onCommands;
	Command[] offCommands;
	
	public BakeryControlHub() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommands(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void setCommandOn(int slot, Command onCommand) {
		onCommands[slot] = onCommand;
	}
	
	public void setCommandOff(int slot, Command offCommand) {
		offCommands[slot] = offCommand;
	}
 
	public void onButtonSelected(int slot) {
		onCommands[slot].execute();
	}
 
	public void offButtonSelected(int slot) {
		offCommands[slot].execute();
	}
    
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Bakery Control Hub -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
	
}
