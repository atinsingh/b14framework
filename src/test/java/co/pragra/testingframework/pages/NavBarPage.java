package co.pragra.testingframework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.json.JsonException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.InvocationTargetException;

public class NavBarPage {
    private WebDriver driver;

    @FindBy(css = "li[class= 'dropdown mobile-hide']>a[id='btnSolutions']")
    private WebElement solutions;
    @FindBy(xpath = "//*[@id=\"first-col-nav\"]/div/a[2]/h3")
    private WebElement roomsAndWorkspaces;
    @FindBy(css ="a[href*='https://marketplace.zoom.us']")
    private WebElement mk;
    @FindBy(css = "a[href*='meetings']")
    private WebElement meetingsandchat;
    @FindBy(xpath ="a[href*='education']")
    private WebElement ed;




    public NavBarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MeetingsAndChat clickMeetingChat() {
        Actions actions = new Actions(driver);
        actions.moveToElement(solutions).moveToElement(meetingsandchat).click().build().perform();
        return new MeetingsAndChat(driver);

    }


    public MarketPlace clickMarketPlace(){
       // WebElement mk= driver.findElement(By.xpath("//*[@id=\"first-col-nav\"]/div/a[5]/h3"));
        Actions actions = new Actions(driver);
        actions.moveToElement(solutions).moveToElement(mk).click().build().perform();

        //actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"first-col-nav\"]/div/a[5]/h3"))).click().build().perform();

        return new MarketPlace(driver);
    }
    public educationSol clickEducation(){
        Actions actions = new Actions(driver);
        actions.moveToElement(solutions).moveToElement(ed).click().build().perform();
        return new educationSol(driver);
    }



}