package co.pragra.testingframework.testcaes;

import co.pragra.testingframework.config.Configuration;
import co.pragra.testingframework.drivermanager.DriverManager;
import co.pragra.testingframework.pages.*;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;

public class HomePageTest {
    WebDriver driver;
    TopNavigation topNavigation;
    RequestDemoPage requestDemoPage;
    LiveTraining liveTraining;
    NavBarPage navBarPage;
    RoomsAndWorkspaces roomsAndWorkspaces;


    @BeforeSuite
    public void setUp() {
        driver = DriverManager.getWebDriver();
        driver.get(Configuration.getInstance().getProperty("appUrl"));
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void setPages() {
        topNavigation = new TopNavigation(driver);
        navBarPage = new NavBarPage(driver);
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

    @Test
    public void testLiveTraining(){
        LiveTraining liveTraining = topNavigation.clickLiveTraining();
    }

    @Test
    public void testRoomsAndWorkspaces(){
        RoomsAndWorkspaces roomsAndWorkspaces = navBarPage.clickRoomsAndWorkspaces();
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
