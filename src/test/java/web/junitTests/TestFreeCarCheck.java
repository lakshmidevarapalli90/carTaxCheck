package web.junitTests;

import org.junit.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.LoggerFactory;
import web.ReadCarOutPut;
import web.ReadVehicleRegNum;
import web.pages.CarTaxCheckPage;
import web.pages.VehicleIdentityPage;
import org.slf4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestFreeCarCheck {

    private static final Logger logger = LoggerFactory.getLogger(TestFreeCarCheck.class);
    private static final String url = "https://cartaxcheck.co.uk/";
    private static final String GECKODRIVER = "src/test/resources/drivers/geckodriver.exe";
    private static FirefoxDriver driver;

    @BeforeClass
    public static void openBrowser() {
        logger.info("Running firefox webdriver with Driver Path:- " + GECKODRIVER);
        System.setProperty("webdriver.gecko.driver", GECKODRIVER);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void freeCarCheck() throws IOException {

       ArrayList<String> regNum = ReadVehicleRegNum.regNumList();
       ArrayList<String[]> outputData = ReadCarOutPut.carOutPutData();

       for (String reg : regNum) {

           driver.get(url);
           CarTaxCheckPage carTaxCheckPage = PageFactory.initElements(driver, CarTaxCheckPage.class);
           logger.info("Browser launched with carTaxCheck URL");

          WebElement input = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(carTaxCheckPage.regInput));
           input.clear();
           carTaxCheckPage.regInput.sendKeys(reg);
           carTaxCheckPage.getFreeCarCheck.click();

           VehicleIdentityPage vehicleIdentityPage = PageFactory.initElements(driver, VehicleIdentityPage.class);

           ArrayList<String> carDetails = new ArrayList<String>();

           String registrationText = vehicleIdentityPage.registration.getText();
           carDetails.add(registrationText);

           String make = vehicleIdentityPage.make.getText();
           carDetails.add(make);

           String model = vehicleIdentityPage.model.getText();
           carDetails.add(model);

           String colour = vehicleIdentityPage.colour.getText();
           carDetails.add(colour);

           String year = vehicleIdentityPage.year.getText();
           carDetails.add(year);

           for (String[] carOutputData: outputData) {

               if(String.valueOf(carDetails).contains(Arrays.toString(carOutputData))){
                   logger.info(Arrays.toString(carOutputData));
                   logger.info("Car Details are accurate");
               }

           }

       }

    }

    @AfterClass
    public static void closeBrowser() {
        driver.close();

    }

}
