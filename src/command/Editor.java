package command;

public class Editor {
    private Command command;
    public Editor(Command command){
        this.command = command;
    }

    void setCommand(Command command) {
        if(command!=null) this.command = command;
    }

    void execute(){
        if(command!=null) this.command.execute();
    }
}
