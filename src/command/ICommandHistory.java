package command;

public interface ICommandHistory {
    void addCommand(Command command);
    Command undoCommand();
}
