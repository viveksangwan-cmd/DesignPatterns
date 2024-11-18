package memento;

public class TextArea {
    private String context;

    public TextArea(){}

    public void setContext(String context){
        this.context = context;
    }

    public String getContext() {
        return this.context;
    }

    public TextAreaMemento save(){
        return new TextAreaMemento(this.context);
    }

    public void restore(TextAreaMemento memento){
        if(memento==null) this.context = "--";
        else this.context = memento.context;
    }

    public static class TextAreaMemento{
        private final String context;

        public TextAreaMemento(String context){
            this.context = context;
        }

        private String getContext(){
            return this.context;
        }
    }
}
