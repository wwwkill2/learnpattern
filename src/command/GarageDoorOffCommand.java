package command;

public class GarageDoorOffCommand implements Command {

	GarageDoor door;

	public GarageDoorOffCommand(GarageDoor door) {
		this.door = door;
	}

	@Override
	public void execute() {
		door.down();
	}

	@Override
	public void undo() {
		door.up();
	}

}
