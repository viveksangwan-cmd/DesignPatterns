package TemplateMethod;

abstract public class DataMiner {

    protected String filename;

    DataMiner(String filename){
        this.filename = filename;
    }

    public void getParsedDataFromFile(){
        openFile();
        parseData();
        closeFile();
    }

    protected void openFile(){
        System.out.println("Opening the file : "+filename);
    }

    abstract void parseData();

    protected void closeFile(){
        System.out.println("Closing the file : "+filename);
    }
}
