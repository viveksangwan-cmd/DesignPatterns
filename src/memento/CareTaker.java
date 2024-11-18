package memento;

import java.util.Stack;

public class CareTaker {

    Stack<TextArea.TextAreaMemento> history;

    public CareTaker(){
        this.history = new Stack<>();
    }

    public void save(TextArea.TextAreaMemento memento){
        history.add(memento);
    }

    public TextArea.TextAreaMemento restore(){
        if(!history.isEmpty()) return history.pop();
        return null;
    }
}
