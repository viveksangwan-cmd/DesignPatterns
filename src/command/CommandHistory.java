package command;

import java.util.Stack;

public class CommandHistory implements ICommandHistory{
    private Stack<Command> commandList;

    public CommandHistory(){
        commandList = new Stack<>();
    }

    @Override
    public void addCommand(Command command) {
        commandList.add(command);
    }

    @Override
    public Command undoCommand() {
        return (!commandList.isEmpty()) ? commandList.pop() : null;
    }
}
