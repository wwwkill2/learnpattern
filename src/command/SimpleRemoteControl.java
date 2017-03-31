package command;

public class SimpleRemoteControl {
	
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public SimpleRemoteControl(){
		onCommands = new Command[3];
		offCommands = new Command[3];
		NoCommand noCommand = new NoCommand();
		for (int i = 0; i < 3; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPressed() {
		undoCommand.undo();
	}
	
}
