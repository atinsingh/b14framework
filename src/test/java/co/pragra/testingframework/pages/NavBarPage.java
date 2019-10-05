package co.pragra.testingframework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavBarPage {

    private WebDriver driver;

    @FindBy(css = "li[class='dropdown mobile-hide']>a[id='btnSolutions']")
    private WebElement solutions;
    @FindBy(css ="a[href*='https://marketplace.zoom.us']")
    private WebElement mk;
    @FindBy(css = "a[href*='meetings']")
    private WebElement meetingsandchat;
    @FindBy(xpath ="a[href*='education']")
    private WebElement ed;
    @FindBy(css = "a[href=\"https://zoom.us/phonesystem\"]")
    private WebElement phoneSystem;
    @FindBy(css = "a[href*='zoomrooms']")
    private WebElement roomsAndWorkspaces;
    @FindBy(xpath="//*[@id='first-col-nav']/div/a[4]")
    private  WebElement VideoWeb;
    @FindBy(css = "a[href*='/finance']>h3")
    private WebElement finance;
    @FindBy(css = "a[id='btnJoinMeeting']")
    private WebElement joinMeeting;
    @FindBy(css = "li[class='signin']")
    private WebElement signIn;
    @FindBy(css="div[id='signupfree']")
    private WebElement signUp;


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

//    public FinancePage clickFinance() throws InterruptedException {
//        Actions actions = new Actions(driver);
//        WebDriverWait wait = new WebDriverWait(driver, 1000);
//        actions.moveToElement(solutions).moveToElement(finance).click().build().perform();
//        Thread.sleep(4000);
//        try {
//           actions.moveToElement(finance).click().perform();
//       }catch (Exception ex){
//            ex.printStackTrace();
//        }
//        return new FinancePage(driver);
//    }
    public FinancePage clickFinance(){
        Actions actions = new Actions(driver);
        actions.moveToElement(solutions).moveToElement(finance).click().build().perform();
        return new FinancePage(driver);
    }

    public JoinMeetingPage clickJoinMeeting() {
        this.joinMeeting.click();
        return new JoinMeetingPage(driver);
    }

     public SignInPage clickSignIn(){
         this.signIn.click();
         return new SignInPage(driver);
        }

      public SignUpPage clickSignUp(){
        this.signUp.click();
        return new SignUpPage(driver);
      }

   }


