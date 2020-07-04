package web.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleIdentityPage {

    @FindBy(css = "div.jsx-1745606755:nth-child(3) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1) > div:nth-child(2) > dl:nth-child(1) > dd:nth-child(2)")
    public WebElement registration;

    @FindBy(xpath = "/html//div[@id='m']/div[@class='jsx-79705764']/div[3]/div[1]/div/span[@class='jsx-2222053380']/div[2]/dl[2]/dd[@class='jsx-3496807389']")
    public WebElement make;

    @FindBy(css = "#m [class='jsx-1745606755 m-w-1 d-w-3 p-w-1']:nth-of-type(3) [class='jsx-3315683148    '] [class='jsx-3583247658 ']:nth-of-type(3) dd")
    public WebElement model;

    @FindBy(xpath = "/html//div[@id='m']/div[@class='jsx-79705764']/div[3]/div[1]/div/span[@class='jsx-2222053380']/div[2]/dl[4]/dd[@class='jsx-3496807389']")
    public WebElement colour;

    @FindBy(xpath = "/html//div[@id='m']/div[@class='jsx-79705764']/div[3]/div[1]/div/span[@class='jsx-2222053380']/div[2]/dl[5]/dd[@class='jsx-3496807389']")
    public WebElement year;

}
