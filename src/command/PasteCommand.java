package command;

public class PasteCommand implements Command,Button{

    @Override
    public void execute() {
        System.out.println("Past Command Executed");
    }
}
