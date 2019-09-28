package co.pragra.testingframework.pages;
<<<<<<< HEAD
<<<<<<< HEAD
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavBarPage {
    private WebDriver driver;

    @FindBy(css = "li[class= 'dropdown mobile-hide']>a[id='btnSolutions']")
    private WebElement solutions;
// @FindBy(css = "a[href*=\"zoomrooms\"]")
    @FindBy(css = "a[href*='zoomrooms']")
    private WebElement roomsAndWorkspaces;



=======
>>>>>>> 6316963b81f07a429434421adf0eccff1ef575d8
=======

>>>>>>> d1e7da24fd616cf2c9f2c16edcd198ea52e4cae9
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
<<<<<<< HEAD
=======
import org.openqa.selenium.support.ui.ExpectedCondition;
>>>>>>> d1e7da24fd616cf2c9f2c16edcd198ea52e4cae9
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavBarPage {
<<<<<<< HEAD
    private WebDriver driver;
   // public  WebDriverWait wait = new WebDriverWait(driver, 20);

    @FindBy (css = "li[class='dropdown mobile-hide']>a[id='btnSolutions']")
    private WebElement solutions;

   // @FindBy (css ="a[href='\\meetings']")

    @FindBy(css = "a[href*='meetings']")
    //@FindBy(css = "a[href=\"https://zoom.us/phonesystem\"]")
    private WebElement meetingsandchat;

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

}
=======
    private  WebDriver driver;


//    @FindBy(css="id= navbar")
    @FindBy(xpath = "//*[@id=\"btnSolutions\"]")
    private  WebElement Solution;

//    @FindBy(css = "a[href='\\pricing'")

    @FindBy(xpath="//*[@id='first-col-nav']/div/a[4]")
    private  WebElement VideoWeb;
>>>>>>> d1e7da24fd616cf2c9f2c16edcd198ea52e4cae9

    public NavBarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


<<<<<<< HEAD
    public RoomsAndWorkspaces clickRoomsAndWorkspaces(){
        Actions actions = new Actions(driver);
        actions.moveToElement(solutions).build().perform();
       actions.moveToElement(roomsAndWorkspaces).click().build().perform();
        return new RoomsAndWorkspaces(driver);


}
}
=======

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



>>>>>>> d1e7da24fd616cf2c9f2c16edcd198ea52e4cae9
