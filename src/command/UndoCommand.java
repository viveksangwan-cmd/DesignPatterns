package command;

public class UndoCommand implements Command, Button{
    @Override
    public void execute() {
        System.out.println("Undo Command Executed");
    }
}
