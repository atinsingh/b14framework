package co.pragra.testingframework.pages;
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




    public NavBarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public RoomsAndWorkspaces clickRoomsAndWorkspaces(){
        Actions actions = new Actions(driver);
        actions.moveToElement(solutions).build().perform();
       actions.moveToElement(roomsAndWorkspaces).click().build().perform();
        return new RoomsAndWorkspaces(driver);


}
}
