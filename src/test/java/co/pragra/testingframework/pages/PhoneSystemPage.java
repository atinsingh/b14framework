package co.pragra.testingframework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhoneSystemPage {
<<<<<<< HEAD
<<<<<<< HEAD

    public PhoneSystemPage(WebDriver driver) {

=======
=======

    @FindBy(css =".phone img")
    WebElement logoZoomPhoneImg;

    @FindBy(css = ".zoom-container.relative h4")
    WebElement videoFirstUnifiedText;

    @FindBy(css = ".zoom-container.relative a")
    WebElement buyNowBtn;

    @FindBy(css = ".hero-featured-image.d-none.d-sm-block")
    WebElement heroFeaturedImg;

    @FindBy(xpath = "//h2[text()='Bridge the gap to video-first unified business communications with one easy-to-use solution']")
    WebElement videoFirstUnifiedBusinessText;


    @FindBy(xpath = "//a[contains(text(),'Zoom Phone overview')]")
    WebElement zoomPhoneOverviewLink;

    @FindBy(xpath = "//a[contains(text(),'Zoom Phone: Your top 10 most frequently asked questions')]")
    WebElement zoomPhoneFAQText;

    @FindBy(css = ".zoom-phone-link a[href='/docs/en-us/zoom-phone-features.html']")
    WebElement clickHereToLearnAboutAdditionalLink;

    @FindBy(css = "#email")
    WebElement emailInput;

    @FindBy(css = "#company")
    WebElement companyInput;

    @FindBy(css = "#first_name")
    WebElement firstNameInput;


    @FindBy(css = "#last_name")
    WebElement lastNmaeInput;

    @FindBy(css = "#employee_count")
    WebElement employeeCountInput;

    @FindBy(css = "#phone")
    WebElement phoneInput;

    @FindBy(css = "#country")
    WebElement countryInput;

    @FindBy(css = "#state")
    WebElement ststeInput;

    @FindBy(css = "#city")
    WebElement headquartersZipInput;

    @FindBy(css = "#description")
    WebElement additionalInfoInput;

    @FindBy(css = "#btnSubmit")
    WebElement submitBtn;

    @FindBy(css = "//span[text()='Help']")
    WebElement helpLink;

>>>>>>> fd2f9797e678ec94ff3f8e9e03d0f36babe50839
    public PhoneSystemPage(WebDriver driver) {
>>>>>>> 01eda664466d1403ee1a78778e7a64eeb0111b0d
    }


    public boolean logoZoomPhoneImg(){

        return logoZoomPhoneImg.isDisplayed();
    }

    public boolean videoFirstUnifiedText(){

        return videoFirstUnifiedText.isDisplayed();

    }

    public BuyPlanPage buyNowBtn(){

        return BuyPlanPage buyNowBtn.click();
    }
}
