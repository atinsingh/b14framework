package co.pragra.testingframework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopNavigation {

    private WebDriver driver;

    @FindBy(css = "#black-topbar ul>li>a[href='https://zoom.us/livedemo']")
    private WebElement requstADemoLink;

    @FindBy(css = "a[href='tel:1.888.799.9666'")
    private WebElement num1800Link;

    @FindBy(css = "#btnResouces")
    private WebElement resources;

    @FindBy(css = "a[href='https://support.zoom.us/hc/en-us/articles/206175806-Top-Questions'")
    private WebElement faq;

    @FindBy(xpath = "//*[@id=\"resourcesDropdown\"]/li[9]/a")
    private WebElement zoomblog;

    @FindBy(css = "a[href='https://support.zoom.us/hc/en-us'")
    private WebElement support;

<<<<<<< HEAD
    @FindBy(css = "a[href='https://zoom.us/livetraining'")
    private WebElement livetraining;
=======
    @FindBy (css = "a[href='https://zoom.us/download#client_4meeting'")
    private WebElement downloadzoomclient;
>>>>>>> 6316963b81f07a429434421adf0eccff1ef575d8

    public TopNavigation(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public RequestDemoPage clickRequestDemoLink(){
        this.requstADemoLink.click();
        return new RequestDemoPage(driver);
    }

    public FaQPage clickFAQ(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources).moveToElement(faq).click().perform();
        return new FaQPage(driver);
    }

<<<<<<< HEAD
    public DownloadZoomClient clickDownloadZoom(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources).moveToElement(downloadzoomclient).click().perform();
        return new DownloadZoomClient(driver);
    }

    }




=======
    public ZoomBlog clickZoomBlog(){
        Actions actions=new Actions(driver);
        actions.moveToElement(resources).moveToElement(zoomblog).click().perform();
        return new ZoomBlog(driver);
    }

>>>>>>> d1e7da24fd616cf2c9f2c16edcd198ea52e4cae9

<<<<<<< HEAD
    public LiveTraining clickLiveTraining(){
        Actions actions = new Actions(driver);
        actions.moveToElement(resources).moveToElement(livetraining).click().perform();
        return new LiveTraining(driver);
    }
}
=======
>>>>>>> 6316963b81f07a429434421adf0eccff1ef575d8
