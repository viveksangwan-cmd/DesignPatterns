package TemplateMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<DataMiner> dataMinerList = new ArrayList<>();
        dataMinerList.add(new XAMLDataMiner("xamlFileLocation"));
        dataMinerList.add(new PDFDataMiner("pdfFileLocation"));

        for(DataMiner dataMiner: dataMinerList)
            dataMiner.getParsedDataFromFile();
    }
}
