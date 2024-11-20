package command;


public class Main {

    public static void main(String[] args) {
        EditorApplication editorApplication = new EditorApplication();
        editorApplication.copy();
        editorApplication.cut();
        editorApplication.paste();

        editorApplication.undo();
        editorApplication.undo();
    }
}
