package memento;

import java.awt.*;

public class TestEditor {
    public static void main(String[] args) {
        TextArea textArea = new TextArea();
        CareTaker careTaker = new CareTaker();

        textArea.setContext("Hello World");
        System.out.println(textArea.getContext());

        careTaker.save(textArea);

        textArea.setContext("Design pattern");
        careTaker.save(textArea);

        System.out.println(textArea.getContext());

        careTaker.restore(textArea);
        System.out.println(textArea.getContext());

        careTaker.restore(textArea);
        System.out.println(textArea.getContext());

    }
}
