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
    //LiveTraining liveTraining;
    NavBarPage navBarPage;
   // RoomsAndWorkspaces roomsAndWorkspaces;

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
=======
>>>>>>> d1e7da24fd616cf2c9f2c16edcd198ea52e4cae9
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
<<<<<<< HEAD
    public void testLiveTraining(){
        LiveTraining liveTraining = topNavigation.clickLiveTraining();
    }

    @Test
    public void testRoomsAndWorkspaces(){
       RoomsAndWorkspaces  roomsAndWorkspaces = navBarPage.clickRoomsAndWorkspaces();
    }

    @AfterSuite
    public void tearDown() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
=======
    public void testZoomBlog(){
       ZoomBlog zoomBlog= topNavigation.clickZoomBlog();
>>>>>>> d1e7da24fd616cf2c9f2c16edcd198ea52e4cae9
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



}
