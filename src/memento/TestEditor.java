package memento;

import java.awt.*;

public class TestEditor {
    public static void main(String[] args) {
        TextArea textArea = new TextArea();
        CareTaker careTaker = new CareTaker();

        textArea.setContext("Hello World");
        System.out.println(textArea.getContext());

        careTaker.save(textArea.save());

        textArea.setContext("Design pattern");
        careTaker.save(textArea.save());

        System.out.println(textArea.getContext());

        textArea.restore(careTaker.restore());
        System.out.println(textArea.getContext());

        textArea.restore(careTaker.restore());
        System.out.println(textArea.getContext());

        textArea.restore(careTaker.restore());
        System.out.println(textArea.getContext());

    }
}
