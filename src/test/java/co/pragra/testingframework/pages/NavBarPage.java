package co.pragra.testingframework.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavBarPage {
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
