package command;

//Receiver
public class CutCommand implements Command{
    private final Editor editor;

    public CutCommand(Editor editor){
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.cut();
    }
}
