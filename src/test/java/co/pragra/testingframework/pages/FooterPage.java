package co.pragra.testingframework.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPage {

    private WebDriver driver;
//(css = "div[class='h4']>a[href*='/contactsales']")
    @FindBy(css = "a[href*='/contactsales']")
    private WebElement Sales;

    @FindBy(css = "a[href='tel:1.888.799.9666']")
    private WebElement SupportPh;

    @FindBy(css = "div[class='ft-sales']>ul>li>a[href*='/contactsales']")
    private WebElement ContactSales;

    @FindBy(css = "div[class='ft-sales']>ul>li>a[href*='/pricing']")
    private WebElement PlansPricing;

    public FooterPage (WebDriver driver){
    this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public SalesPage clickSalesLink(){
        this.Sales.click();
        return new SalesPage(driver);
    }

    public SupportPhonePage clickSupportPhLink(){
        this.SupportPh.click();
        return new SupportPhonePage(driver);
    }

    public ContactSalesPage clickContactSalesLink(){
        this.ContactSales.click();
        return new ContactSalesPage(driver);
    }

    public PlansPricingPage clickPalansPricingLink(){
        this.PlansPricing.click();
        return new PlansPricingPage(driver);

    }

}



