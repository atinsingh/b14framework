package co.pragra.testingframework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavBarPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"btnSolutions\"]")
    private WebElement sol;
    @FindBy(css ="a[href*='https://marketplace.zoom.us/?_ga=2.237357440.1682688846.1569680253-811731806.1562719877']")
    private WebElement mk;

//    @FindBy(xpath = "//*[@id=\"first-col-nav\"]/div/a[3]/h3")
//    private WebElement pk;

    public NavBarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public MarketPlace clickMarketPlace(){
        Actions actions = new Actions(driver);
        actions.moveToElement(sol);
        actions.build().perform();

        actions.moveToElement(mk).click().perform();
        return new MarketPlace(driver);
    }
//    public PhoneSystemPage clickPhoneSystem(){
//        Actions actions = new Actions(driver);
//        actions.moveToElement(sol).build().perform();
//
//        actions.moveToElement(pk).click().perform();
//        return new PhoneSystemPage(driver);
//    }

}
