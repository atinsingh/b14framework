package co.pragra.testingframework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequestDemoPage {
    private WebDriver driver;

    @FindBy(css = "#email")
    private WebElement emailInput;

    @FindBy(css = "#company")
    private WebElement companyInput;


    public RequestDemoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public RequestDemoPage keyInEmail(String email){
        emailInput.sendKeys(email);
        return this;
    }

    public RequestDemoPage keyInCompanty(String company){
        companyInput.sendKeys(company);
        return this;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public RequestDemoPage and(){
        return this;
    }

    public WebElement getCompanyInput() {
        return companyInput;
    }
}

