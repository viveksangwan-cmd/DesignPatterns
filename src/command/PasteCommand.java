package command;

//Receiver
public class PasteCommand implements Command {

    private final Editor editor;

    public PasteCommand(Editor editor){
        this.editor = editor;
    }
    @Override
    public void execute() {
        editor.past();
    }
}
