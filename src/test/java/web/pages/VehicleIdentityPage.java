package web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleIdentityPage {

    @FindBy(css = "div.jsx-1745606755:nth-child(3) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > dl:nth-child(1) > dd:nth-child(2)")
    public WebElement registration;

    @FindBy(css = "div:nth-of-type(3) > .jsx-3315683148 .jsx-3249698312 > dl:nth-of-type(2) > .jsx-3496807389")
    public WebElement make;

    @FindBy(css = "div:nth-of-type(3) > .jsx-3315683148 .jsx-3249698312 > dl:nth-of-type(3) > .jsx-3496807389")
    public WebElement model;

    @FindBy(css = "div:nth-of-type(3) > .jsx-3315683148 .jsx-3249698312 > dl:nth-of-type(4) > .jsx-3496807389")
    public WebElement colour;

    @FindBy(css = "div:nth-of-type(3) > .jsx-3315683148 .jsx-3249698312 > dl:nth-of-type(5) > .jsx-3496807389")
    public WebElement year;

}
