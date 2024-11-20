package command;

public class CopyCommand implements Command, Button{
    @Override
    public void execute() {
        System.out.println("Copy Command Executed");
    }
}
