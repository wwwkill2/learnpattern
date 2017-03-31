package command;

import java.util.ArrayList;
import java.util.List;

public class LightAndDoorOnCommand implements Command {

	// 思考为什么这里是命令集合，而不是接受者集合
	List<Command> commands;

	public LightAndDoorOnCommand(Command... commands) {
		this.commands = new ArrayList<>();
		for (Command command : commands) {
			this.commands.add(command);
		}
	}

	@Override
	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
	}

	@Override
	public void undo() {
		for (Command command : commands) {
			command.undo();
		}
	}

}
