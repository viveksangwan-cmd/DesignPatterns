package command;

public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor(new CopyCommand());
        CommandHistory history = new CommandHistory();

        editor.execute();
        history.addCommand(new CopyCommand());

        editor.setCommand(new CutCommand());
        editor.execute();
        history.addCommand(new CutCommand());

        editor.setCommand(history.undoCommand());
        editor.execute();

        editor.setCommand(history.undoCommand());
        editor.execute();

    }
}
