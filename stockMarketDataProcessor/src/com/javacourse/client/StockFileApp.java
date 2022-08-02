package com.javacourse.client;

import fileprocessors.StockFileData;
import fileprocessors.StockFileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StockFileApp  {
    public static void main(String args[]) throws IOException{
        StockFileReader fr = new StockFileReader("table.csv");

        List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
        StockFileData fileData = new StockFileData();
        fileData.addData(dataResult);
        fileData.printData();
        System.out.println(dataResult.size());
    }
    /**
     * @param headers
     * @param lines
     * @return List
     */
    public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines){
        List<HashMap<String, Double>> dataResult = new ArrayList<>();
        // Insert your code here..
        return dataResult;
    }
}
