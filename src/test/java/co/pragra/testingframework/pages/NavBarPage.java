package co.pragra.testingframework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.json.JsonException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.lang.reflect.InvocationTargetException;

public class NavBarPage {

    private WebDriver driver;

    //li[class='dropdown mobile-hide']>a[id='btnSolutions']

    @FindBy(css = "li[class='dropdown mobile-hide']>a[id='btnSolutions']")
    private WebElement solutions;
    
    @FindBy(css ="a[href*='https://marketplace.zoom.us']")
    private WebElement mk;
    @FindBy(css = "a[href*='meetings']")
    private WebElement meetingsandchat;
    @FindBy(xpath ="a[href*='education']")
    private WebElement ed;


    //a[href="/zoomrooms"]

    //a[href="https://zoom.us/phonesystem"]
    @FindBy(css = "a[href=\"https://zoom.us/phonesystem\"]")
    private WebElement phoneSystem;

  

    
    @FindBy(css = "a[href*='zoomrooms']")
    private WebElement roomsAndWorkspaces;


    @FindBy(css = "a[href*='meetings']")
    //@FindBy(css = "a[href=\"https://zoom.us/phonesystem\"]")
    private WebElement meetingsandchat;
    


    @FindBy(xpath="//*[@id='first-col-nav']/div/a[4]")
    private  WebElement VideoWeb;
    private WebElement Solution;


    public NavBarPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MeetingsAndChat clickMeetingChat() {
      //  wait.until(ExpectedConditions.visibilityOf(meetingsandchat));
        Actions actions = new Actions(driver);
        actions.moveToElement(solutions).moveToElement(meetingsandchat).click().build().perform();
        return new MeetingsAndChat(driver);

    }


    public RoomsAndWorkspaces clickRoomsAndWorkspaces(){
        Actions actions = new Actions(driver);
        actions.moveToElement(solutions).build().perform();
       actions.moveToElement(roomsAndWorkspaces).click().build().perform();
        return new RoomsAndWorkspaces(driver);

}

    public VideoWebinars clickVideoWebinars(){
        Actions actions=new Actions(driver);
        actions.moveToElement(solutions);
        actions.build().perform();
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.elementToBeClickable(VideoWeb));
        actions.moveToElement(VideoWeb).click().perform();
        return new VideoWebinars(driver);
    }

}


