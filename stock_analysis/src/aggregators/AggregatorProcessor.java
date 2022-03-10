package aggregators;

import fileprocessors.StockFileReader;
import java.io.IOException;
import java.util.List;

public class AggregatorProcessor <T extends Aggregator> {
    T agg;
    String file;

    public AggregatorProcessor(T agg, String file){
        super();
        this.agg = agg;
        this.file = file;
    }

    public double runAggregator(int colIdx) throws IOException {
        StockFileReader fileReader = new StockFileReader(file);
        List<String> lines = fileReader.readFileData();
        colIdx--;
        for(String line : lines){
            String [] numbers = line.split(",");
            double value = Double.parseDouble(numbers[colIdx]);
            agg.add(value);
        }

        double number = agg.calculate();
        return number;
    }
}
