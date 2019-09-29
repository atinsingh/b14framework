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

    
  
    

    @FindBy(xpath="//*[@id='first-col-nav']/div/a[4]")
    private  WebElement VideoWeb;

    public NavBarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public PhoneSystemPage clickPhoneSystem(){
        Actions actions = new Actions(driver);
        actions.moveToElement(solutions).moveToElement(phoneSystem).click().build().perform();
        return new PhoneSystemPage(driver);
    }


//    public MeetingAndChats clickMeetingAndChats(){
//        Actions actions = new Actions(driver);
//        actions.moveToElement(solutions).moveToElement(meetingAndChats).click().build().perform();
//        return new MeetingAndChats(driver);
//    }


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


