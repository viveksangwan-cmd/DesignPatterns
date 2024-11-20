package command;

public class CutCommand implements Command, Button{
    @Override
    public void execute() {
        System.out.println("Cut Command Executed");
    }
}
