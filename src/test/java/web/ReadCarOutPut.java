package web;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadCarOutPut {

    private static final Logger logger = LoggerFactory.getLogger(ReadVehicleRegNum.class);

    public static ArrayList<String[]> carOutPutData() throws IOException {

        FileReader fileReader = new FileReader("src/test/resources/testData/car_output.txt");
        CSVReader csvReader = new CSVReaderBuilder(fileReader)
                                    .withSkipLines(1)
                                    .build();

        ArrayList<String[]> allData = (ArrayList<String[]>) csvReader.readAll();

        for (String[] row: allData) {
            for (String cell : row) {
                logger.info(cell + "\t");
            }
            System.out.println();
        }

        return allData;

    }


}
