package web;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ReadVehicleRegNum {

    private static final Logger logger = LoggerFactory.getLogger(ReadVehicleRegNum.class);

    public static List<String> regNumList() throws IOException {

        File myObj = new File("src/test/resources/testData/car_input.txt");
        String data = "";

        List<String> regNum = new ArrayList<String>();

        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            data = myReader.nextLine();

            String patternString1 = "[A-Z][A-Z]\\d\\d[A-Z][A-Z][A-Z]";

            Pattern pattern = Pattern.compile(patternString1);
            Matcher m1 = pattern.matcher(data);

            if (m1.find()) {
                regNum.add(m1.group());
            }


            String patternString2 = "[A-Z][A-Z]\\d\\d [A-Z][A-Z][A-Z]";

            Pattern pattern2 = Pattern.compile(patternString2);
            Matcher m2 = pattern2.matcher(data);

            if (m2.find()) {

                regNum.add(m2.group());
            }
        }
        myReader.close();

        logger.info("Regnum " + regNum + " list created");

        return regNum;
    }
}
