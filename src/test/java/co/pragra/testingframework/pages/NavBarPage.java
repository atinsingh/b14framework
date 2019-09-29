package co.pragra.testingframework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavBarPage {

    private WebDriver driver;

    //li[class='dropdown mobile-hide']>a[id='btnSolutions']

    @FindBy(css = "li[class='dropdown mobile-hide']>a[id='btnSolutions']")
    private WebElement solutions;


    //a[href="/zoomrooms"]

    //a[href="https://zoom.us/phonesystem"]
    @FindBy(css = "a[href=\"https://zoom.us/phonesystem\"]")
    private WebElement phoneSystem;

    @FindBy(css = "a[href*='zoomrooms']")
    private WebElement meetingAndChats;


    public NavBarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
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

}
