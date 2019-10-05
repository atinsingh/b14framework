package co.pragra.testingframework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavBarPage {

    private WebDriver driver;

<<<<<<< HEAD
=======

>>>>>>> 01eda664466d1403ee1a78778e7a64eeb0111b0d
    @FindBy(css = "li[class='dropdown mobile-hide']>a[id='btnSolutions']")
    private WebElement solutions;
    @FindBy(css ="a[href*='https://marketplace.zoom.us']")
    private WebElement mk;
    
    @FindBy(xpath ="a[href*='education']")
    private WebElement ed;
<<<<<<< HEAD
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
=======


    @FindBy(css = "a[href=\"https://zoom.us/phonesystem\"]")
    private WebElement phoneSystem;


    @FindBy(css = "a[href*='zoomrooms']")
    private WebElement roomsAndWorkspaces;


    @FindBy(css = "a[href*='meetings']")
    private WebElement meetingsandchat;


    @FindBy(xpath="//*[@id='first-col-nav']/div/a[4]")
    private  WebElement VideoWeb;
>>>>>>> 01eda664466d1403ee1a78778e7a64eeb0111b0d

    @FindBy(css = "a[href*='healthcare']")
    private WebElement healthcare;

    ////h3[text()='Finance' ]
   // @FindBy(css = "a[href*='finance']")

    @FindBy(css=".textwidget a[href*='/finance']")
    private WebElement finance;



    public NavBarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public PhoneSystemPage clickPhoneSystem(){
        Actions actions = new Actions(driver);
        actions.moveToElement(solutions).moveToElement(phoneSystem).click().build().perform();
        return new PhoneSystemPage(driver);
    }

    public HealthcarePage clickHealthcare(){
        Actions actions = new Actions(driver);
        actions.moveToElement(solutions).moveToElement(healthcare).click().build().perform();
        return new HealthcarePage(driver);
    }


    public FinancePage clickFinance(){

        Actions actions = new Actions(driver);
        actions.moveToElement(solutions).moveToElement(finance).click().build().perform();

        //actions.moveToElement(finance).click().build().perform();
        return new FinancePage(driver);
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

<<<<<<< HEAD
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
=======
    public MarketPlace clickMarketPlace(){
        Actions actions = new Actions(driver);
        actions.moveToElement(solutions).build().perform();

        actions.moveToElement(mk).click().perform();
        return new MarketPlace(driver);
    }

}
>>>>>>> fd2f9797e678ec94ff3f8e9e03d0f36babe50839


