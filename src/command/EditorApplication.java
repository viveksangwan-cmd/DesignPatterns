package command;

public class EditorApplication {
    private final Editor editor;
    private final CommandHistory commandHistory;
    private final Command copyCommand;
    private final Command cutCommand;
    private final Command pasteCommand;


    public EditorApplication(){
        editor = new Editor();
        copyCommand = new CopyCommand(editor);
        cutCommand = new CutCommand(editor);
        pasteCommand = new PasteCommand(editor);
        commandHistory = new CommandHistory();
    }

    public void copy(){
        copyCommand.execute();
        commandHistory.addCommand(copyCommand);
    }

    public void cut(){
        cutCommand.execute();
        commandHistory.addCommand(cutCommand);
    }

    public void paste(){
        pasteCommand.execute();
        commandHistory.addCommand(pasteCommand);
    }

    public void undo(){
        // Can add undo right now for each command execution, I am just calling the same execution method
        Command lastCommand = commandHistory.undoCommand();
        if(lastCommand!=null) lastCommand.execute();
    }
}
