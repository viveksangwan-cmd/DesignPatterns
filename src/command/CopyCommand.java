package command;

//Receiver
public class CopyCommand implements Command{

    private final Editor editor;

    public CopyCommand(Editor editor){
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.copy();
    }
}
