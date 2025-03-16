package memento;

import java.util.Stack;

public class CareTaker {

    Stack<TextArea.TextAreaMemento> history;

    public CareTaker(){
        this.history = new Stack<>();
    }

    public void save(TextArea editor){
        history.add(editor.save());
    }

    public void restore(TextArea editor){
        if(!history.isEmpty()) {
            history.pop();
            if(!history.isEmpty()) editor.restore(history.peek());
            else editor.restore(null);
        }
    }
}
