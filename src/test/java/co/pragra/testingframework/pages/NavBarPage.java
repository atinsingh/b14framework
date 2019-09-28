package co.pragra.testingframework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavBarPage {
    private  WebDriver driver;


//    @FindBy(css="id= navbar")
    @FindBy(xpath = "//*[@id=\"btnSolutions\"]")
    private  WebElement Solution;

//    @FindBy(css = "a[href='\\pricing'")

    @FindBy(xpath="//*[@id='first-col-nav']/div/a[4]")
    private  WebElement VideoWeb;

    public NavBarPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
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



