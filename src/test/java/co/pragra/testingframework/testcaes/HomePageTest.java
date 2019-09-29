package co.pragra.testingframework.testcaes;

import co.pragra.testingframework.config.Configuration;
import co.pragra.testingframework.drivermanager.DriverManager;
import co.pragra.testingframework.pages.*;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

public class HomePageTest {
    WebDriver driver;
    TopNavigation topNavigation;
    RequestDemoPage requestDemoPage;
    NavBarPage navBarPage;


    @BeforeSuite
    public void setUp() {
        driver = DriverManager.getWebDriver();
        driver.get(Configuration.getInstance().getProperty("appUrl"));
        driver.manage().window().maximize();

       // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
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
    public void testDownloadZoomClient(){DownloadZoomClient downloadZoomClient = topNavigation.clickDownloadZoom();}

    @Test
    public void testMeetingsAndChat(){MeetingsAndChat meetingsAndChat = navBarPage.clickMeetingChat();}

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
