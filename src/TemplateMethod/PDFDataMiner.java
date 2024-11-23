package TemplateMethod;

public class PDFDataMiner extends DataMiner {

    PDFDataMiner(String filename){
        super(filename);
    }

    @Override
    void parseData() {
        System.out.println("Data parsed from pdf format file : "+ filename);
    }
}
