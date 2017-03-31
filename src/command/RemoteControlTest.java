package command;

public class RemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		GarageDoor door = new GarageDoor();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(door);
		GarageDoorOffCommand garageOff = new GarageDoorOffCommand(door);
		
		remote.setCommand(0, lightOn, lightOff);
		remote.setCommand(1, garageOpen, garageOff);
		remote.onButtonWasPressed(0);
		remote.undoButtonWasPressed();
		remote.onButtonWasPressed(1);
		remote.undoButtonWasPressed();
		remote.offButtonWasPressed(0);
		remote.undoButtonWasPressed();
		remote.offButtonWasPressed(1);
		remote.undoButtonWasPressed();
		
		LightAndDoorOnCommand partyCommand = new LightAndDoorOnCommand(lightOn, garageOpen);
		remote.setCommand(2, partyCommand, new NoCommand());
		remote.onButtonWasPressed(2);
		remote.undoButtonWasPressed();
		

	}
}
