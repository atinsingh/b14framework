package co.pragra.testingframework.testcaes;

import co.pragra.testingframework.config.Configuration;
import co.pragra.testingframework.drivermanager.DriverManager;
import co.pragra.testingframework.pages.FaQPage;
import co.pragra.testingframework.pages.HomePage;
import co.pragra.testingframework.pages.RequestDemoPage;
import co.pragra.testingframework.pages.TopNavigation;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;

public class HomePageTest {
    WebDriver driver;
    TopNavigation topNavigation;
    RequestDemoPage requestDemoPage;

    @BeforeSuite
    public void setUp() {
        driver = DriverManager.getWebDriver();
        driver.get(Configuration.getInstance().getProperty("appUrl"));
    }

    @BeforeMethod
    public void setPages() {
        topNavigation = new TopNavigation(driver);
    }

    @Test
    public void testRequestDemo() {
        requestDemoPage = topNavigation.clickRequestDemoLink();
        requestDemoPage.keyInEmail("test@gmail.com")
                .and()
                .keyInCompanty("abc");
    }


    @Test
    public void testFAQ() {
        FaQPage faQPage = topNavigation.clickFAQ();
    }

    @AfterSuite
    public void tearDown() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
