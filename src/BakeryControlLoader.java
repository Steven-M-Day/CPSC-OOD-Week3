import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BakeryControlLoader {
	
	JFrame frame;
	public static void main(String[] args) {
		BakeryControlLoader bakeryControlLoader = new BakeryControlLoader();
		//BakeryControlHub bakeryControlHub = new BakeryControlHub();
		bakeryControlLoader.storeSwitch();
		
		/*
		Light bakeryLight = new Light("Bakery");
		Light bakeryKitchenLight = new Light("Bakery Kitchen");
		KitchenVent kitchenVent= new KitchenVent("Kitchen Vent");
		BakeryDoorLock bakeryDoor = new BakeryDoorLock("Bakery Door");
		Oven oven = new Oven("Bakery Oven");
		
		LightOnCommand bakeryLightOn = 
				new LightOnCommand(bakeryLight);
		LightOffCommand bakeryLightOff = 
				new LightOffCommand(bakeryLight);
		LightOnCommand bakeryKitchenLightOn = 
				new LightOnCommand(bakeryKitchenLight);
		LightOffCommand bakeryKitchenLightOff = 
				new LightOffCommand(bakeryKitchenLight);
  
		OvenOnCommand ovenOn =
				new OvenOnCommand(oven);
		OvenOffCommand ovenOff =
				new OvenOffCommand(oven);
		
		KitchenVentOnCommand kitchenVentOn = 
				new KitchenVentOnCommand(kitchenVent);
		KitchenVentOffCommand kitchenVentOff = 
				new KitchenVentOffCommand(kitchenVent);
 
		BakeryDoorUnlockCommand bakeryDoorUnlock =
				new BakeryDoorUnlockCommand(bakeryDoor);
		BakeryDoorLockCommand bakeryDoorLock =
				new BakeryDoorLockCommand(bakeryDoor);

		
		System.out.println("");
		System.out.println("---- OPEN BAKERY ----");
		
		bakeryControlHub.setCommandOn(0, bakeryDoorUnlock);
		bakeryControlHub.setCommandOn(1, bakeryLightOn);
		bakeryControlHub.setCommandOn(2, bakeryKitchenLightOn);
		bakeryControlHub.setCommandOn(3, ovenOn);
		bakeryControlHub.setCommandOn(4, kitchenVentOn);
		
		System.out.println(bakeryControlHub);
 
		bakeryControlHub.onButtonSelected(0);
		bakeryControlHub.onButtonSelected(1);
		bakeryControlHub.onButtonSelected(2);
		bakeryControlHub.onButtonSelected(3);
		bakeryControlHub.onButtonSelected(4);
		
		System.out.println("");
		System.out.println("---- CLOSE BAKERY ----");
		
		bakeryControlHub.setCommandOff(0, ovenOff);
		bakeryControlHub.setCommandOff(1, kitchenVentOff);
		bakeryControlHub.setCommandOff(2, bakeryKitchenLightOff);
		bakeryControlHub.setCommandOff(3, bakeryLightOff);
		bakeryControlHub.setCommandOff(4, bakeryDoorLock);
		
		System.out.println(bakeryControlHub);
 
		bakeryControlHub.offButtonSelected(0);
		bakeryControlHub.offButtonSelected(1);
		bakeryControlHub.offButtonSelected(2);
		bakeryControlHub.offButtonSelected(3);
		bakeryControlHub.offButtonSelected(4);
		
		
		System.out.println("");
		System.out.println("---- TEST BAKERY FUNCTIONALITY ----");
		
		bakeryControlHub.setCommands(0, bakeryLightOn, bakeryLightOff);
		bakeryControlHub.setCommands(1, bakeryKitchenLightOn, bakeryKitchenLightOff);
		bakeryControlHub.setCommands(2, kitchenVentOn, kitchenVentOff);
		bakeryControlHub.setCommands(3, bakeryDoorLock, bakeryDoorUnlock);
		bakeryControlHub.setCommands(4, ovenOn, ovenOff);
		
		System.out.println(bakeryControlHub);
 
		bakeryControlHub.onButtonSelected(0);
		bakeryControlHub.offButtonSelected(0);
		bakeryControlHub.onButtonSelected(1);
		bakeryControlHub.offButtonSelected(1);
		bakeryControlHub.onButtonSelected(2);
		bakeryControlHub.offButtonSelected(2);
		bakeryControlHub.onButtonSelected(3);
		bakeryControlHub.offButtonSelected(3);
		bakeryControlHub.onButtonSelected(4);
		bakeryControlHub.offButtonSelected(4);
	*/
	}
	
	
	public void storeSwitch() {
		
		BakeryControlHub bakeryControlHub = new BakeryControlHub();
		
		frame = new JFrame();
		frame.setTitle("Bakery");
		frame.setSize(200, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Light bakeryLight = new Light("Bakery");
		Light bakeryKitchenLight = new Light("Bakery Kitchen");
		KitchenVent kitchenVent= new KitchenVent("Kitchen Vent");
		BakeryDoorLock bakeryDoor = new BakeryDoorLock("Bakery Door");
		Oven oven = new Oven("Bakery Oven");
		
		LightOnCommand bakeryLightOn = 
				new LightOnCommand(bakeryLight);
		LightOffCommand bakeryLightOff = 
				new LightOffCommand(bakeryLight);
		LightOnCommand bakeryKitchenLightOn = 
				new LightOnCommand(bakeryKitchenLight);
		LightOffCommand bakeryKitchenLightOff = 
				new LightOffCommand(bakeryKitchenLight);
  
		OvenOnCommand ovenOn =
				new OvenOnCommand(oven);
		OvenOffCommand ovenOff =
				new OvenOffCommand(oven);
		
		KitchenVentOnCommand kitchenVentOn = 
				new KitchenVentOnCommand(kitchenVent);
		KitchenVentOffCommand kitchenVentOff = 
				new KitchenVentOffCommand(kitchenVent);
 
		BakeryDoorUnlockCommand bakeryDoorUnlock =
				new BakeryDoorUnlockCommand(bakeryDoor);
		BakeryDoorLockCommand bakeryDoorLock =
				new BakeryDoorLockCommand(bakeryDoor);
		
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new GridLayout(3, 1));
		
		JButton openButton = new JButton("Open Bakery");
		openButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("");
				System.out.println("---- Opening Bakery ----");
				System.out.println("");
				
				bakeryControlHub.setCommandOn(0, bakeryDoorUnlock);
				bakeryControlHub.setCommandOn(1, bakeryLightOn);
				bakeryControlHub.setCommandOn(2, bakeryKitchenLightOn);
				bakeryControlHub.setCommandOn(3, ovenOn);
				bakeryControlHub.setCommandOn(4, kitchenVentOn);
				
				System.out.println(bakeryControlHub);
		 
				bakeryControlHub.onButtonSelected(0);
				bakeryControlHub.onButtonSelected(1);
				bakeryControlHub.onButtonSelected(2);
				bakeryControlHub.onButtonSelected(3);
				bakeryControlHub.onButtonSelected(4);
				
				System.out.println("");
				System.out.println("---- BAKERY  OPEN ----");
				System.out.println("");
				
			}
		});
		
		JButton closeButton = new JButton("Close Bakery");
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("");
				System.out.println("---- Closing Bakery ----");
				System.out.println("");
				
				bakeryControlHub.setCommandOff(0, ovenOff);
				bakeryControlHub.setCommandOff(1, kitchenVentOff);
				bakeryControlHub.setCommandOff(2, bakeryKitchenLightOff);
				bakeryControlHub.setCommandOff(3, bakeryLightOff);
				bakeryControlHub.setCommandOff(4, bakeryDoorLock);
				
				System.out.println(bakeryControlHub);
		 
				bakeryControlHub.offButtonSelected(0);
				bakeryControlHub.offButtonSelected(1);
				bakeryControlHub.offButtonSelected(2);
				bakeryControlHub.offButtonSelected(3);
				bakeryControlHub.offButtonSelected(4);
				
				System.out.println("");
				System.out.println("---- BAKERY  CLOSED ----");
				System.out.println("");
				
			}
		});
		
		JButton testButton = new JButton("Test Bakery");
		testButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("");
				System.out.println("---- Testing Bakery ----");
				System.out.println("");
				
				bakeryControlHub.setCommands(0, bakeryLightOn, bakeryLightOff);
				bakeryControlHub.setCommands(1, bakeryKitchenLightOn, bakeryKitchenLightOff);
				bakeryControlHub.setCommands(2, kitchenVentOn, kitchenVentOff);
				bakeryControlHub.setCommands(3, bakeryDoorLock, bakeryDoorUnlock);
				bakeryControlHub.setCommands(4, ovenOn, ovenOff);
				
				System.out.println(bakeryControlHub);
		 
				bakeryControlHub.onButtonSelected(0);
				bakeryControlHub.offButtonSelected(0);
				bakeryControlHub.onButtonSelected(1);
				bakeryControlHub.offButtonSelected(1);
				bakeryControlHub.onButtonSelected(2);
				bakeryControlHub.offButtonSelected(2);
				bakeryControlHub.onButtonSelected(3);
				bakeryControlHub.offButtonSelected(3);
				bakeryControlHub.onButtonSelected(4);
				bakeryControlHub.offButtonSelected(4);
				
				System.out.println("");
				System.out.println("---- BAKERY  TESTED ----");
				System.out.println("");
				
			}
		});
		
		contentPane.add(openButton);
		contentPane.add(closeButton);
		contentPane.add(testButton);
		
		frame.pack();
		frame.setVisible(true);
	}
}
