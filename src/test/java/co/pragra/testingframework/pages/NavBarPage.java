package co.pragra.testingframework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavBarPage {
    private WebDriver driver;

    @FindBy(css = "li[class= 'dropdown mobile-hide']>a[id='btnSolutions']")
    private WebElement solutions;

    @FindBy(css = "a[href*='zoomrooms']")
    private WebElement roomsAndWorkspaces;

    @FindBy (css = "li[class='dropdown mobile-hide']>a[id='btnSolutions']")
    private WebElement solutions;

    @FindBy(css = "a[href*='meetings']")
    //@FindBy(css = "a[href=\"https://zoom.us/phonesystem\"]")
    private WebElement meetingsandchat;
    
    @FindBy(xpath = "//*[@id=\"btnSolutions\"]")
    private  WebElement Solution;

    @FindBy(xpath="//*[@id='first-col-nav']/div/a[4]")
    private  WebElement VideoWeb;

    public NavBarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public MeetingsAndChat clickMeetingChat() {

      //  wait.until(ExpectedConditions.visibilityOf(meetingsandchat));
        Actions actions = new Actions(driver);
       // actions.moveToElement(solutions).build().perform();
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
        actions.moveToElement(Solution);
        actions.build().perform();
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.elementToBeClickable(VideoWeb));
        actions.moveToElement(VideoWeb).click().perform();
        return new VideoWebinars(driver);
    }

}


