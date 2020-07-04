package web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarTaxCheckPage {

    @FindBy(xpath = "//*[@id=\"vrm-input\"]")
    public WebElement regInput;

    @FindBy(xpath = "/html//div[@id='m']//div[@class='jsx-4254347488']/span/form[@action='/free-car-check/']/button[.='Free Car Check']")
    public WebElement getFreeCarCheck;


}
