package co.pragra.testingframework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavBarPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"navbar\"]/ul[1]/li[2]/a")
    private WebElement sol;
    @FindBy(xpath = "//*[@id=\"first-col-nav\"]/div/a[5]")
    private WebElement mk;

    @FindBy(xpath = "//*[@id=\"first-col-nav\"]/div/a[3]/h3")
    private WebElement pk;

    public NavBarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public MarketPlace clickMarketPlace(){
        Actions actions = new Actions(driver);
        actions.moveToElement(sol).build().perform();

        actions.moveToElement(mk).click().perform();
        return new MarketPlace(driver);
    }
    public PhoneSystemPage clickPhoneSystem(){
        Actions actions = new Actions(driver);
        actions.moveToElement(sol).build().perform();

        actions.moveToElement(pk).click().perform();
        return new PhoneSystemPage(driver);
    }

}
