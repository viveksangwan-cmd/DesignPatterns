package TemplateMethod;

public class XAMLDataMiner extends DataMiner {
    XAMLDataMiner(String filename){
        super(filename);
    }

    @Override
    void parseData() {
        System.out.println("Data parsed from pdf format file : "+ filename);
    }

}
