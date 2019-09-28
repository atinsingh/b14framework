package co.pragra.testingframework.testcaes;

import co.pragra.testingframework.config.Configuration;
import co.pragra.testingframework.drivermanager.DriverManager;
import co.pragra.testingframework.pages.*;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;

<<<<<<< HEAD
import java.util.concurrent.TimeUnit;
=======

>>>>>>> d1e7da24fd616cf2c9f2c16edcd198ea52e4cae9

public class HomePageTest {
    WebDriver driver;
    TopNavigation topNavigation;
    RequestDemoPage requestDemoPage;
<<<<<<< HEAD
    NavBarPage navBarPage;

=======
    ZoomBlog zoomBlog;
    NavBarPage navBarPage;
    VideoWebinars videoWebinars;
>>>>>>> d1e7da24fd616cf2c9f2c16edcd198ea52e4cae9

    @BeforeSuite
    public void setUp() {
        driver = DriverManager.getWebDriver();
        driver.get(Configuration.getInstance().getProperty("appUrl"));
        driver.manage().window().maximize();
<<<<<<< HEAD
       // driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void setPages() { topNavigation = new TopNavigation(driver);
    navBarPage = new NavBarPage(driver); }

=======
    }

    @BeforeMethod
    public void setPages() {
        topNavigation = new TopNavigation(driver);
        navBarPage = new NavBarPage(driver);
    }
>>>>>>> d1e7da24fd616cf2c9f2c16edcd198ea52e4cae9

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

<<<<<<< HEAD

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

=======
    @Test
    public void testZoomBlog(){
       ZoomBlog zoomBlog= topNavigation.clickZoomBlog();
    }

    @Test
    public void testVideoWebinar(){
        VideoWebinars videoWebinars= navBarPage.clickVideoWebinars();
    }

//    @AfterSuite
//    public void tearDown() {
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.quit();
//    }
>>>>>>> d1e7da24fd616cf2c9f2c16edcd198ea52e4cae9



}
