package co.pragra.testingframework.testcaes;
import co.pragra.testingframework.config.Configuration;
import co.pragra.testingframework.drivermanager.DriverManager;
import co.pragra.testingframework.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


import java.util.concurrent.TimeUnit;

public class HomePageTest {

    private WebDriver driver;
    private TopNavigation topNavigation;
    private RequestDemoPage requestDemoPage;
    private PhoneSystemPage phoneSystemPage;
    private NavBarPage navBarPage;
    private FinancePage financePage;
    private VideoTutorialPage videoTutorialPage;
    private HealthcarePage healthcarePage;
    private ZoomBlog zoomBlog;
    private RoomsAndWorkspaces roomsAndWorkspaces;
    private VideoWebinars videoWebinars;
    private FaQPage faQPage;
    private DownloadZoomClient downloadZoomClient;
    private MeetingsAndChat meetingsAndChat;
    private LiveTraining liveTraining;
   

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

         faQPage = topNavigation.clickFAQ();
    }
    @Test
    public void testWAE() {
        WebinarsAndEvents wae = topNavigation.clickWebinaraAndEvents();
    }
    @Test
    public void testMarketPlace() {
        MarketPlace mp = navBarPage.clickMarketPlace();
    }


    @Test
    public void testVideoTutorial() {

         videoTutorialPage = topNavigation.clickVideoTutorial();
    }

    @Test
    public void testPhoneSystem(){

        phoneSystemPage = navBarPage.clickPhoneSystem();
    }

//    @Test
//    public void testMeetingAndChats(){
//
//        meetingAndChats = navBarPage.clickMeetingAndChats();
//    }


    @Test
    public void testDownloadZoomClient(){


         downloadZoomClient = topNavigation.clickDownloadZoom();}

    @Test
    public void testMeetingsAndChat(){

         meetingsAndChat = navBarPage.clickMeetingChat();}


    @Test
    public void testLiveTraining(){

         liveTraining = topNavigation.clickLiveTraining();
    }

    @Test
    public void testRoomsAndWorkspaces(){

        roomsAndWorkspaces = navBarPage.clickRoomsAndWorkspaces();
    }



//    public void testEducation()
//    {
//        educationSol educationsol = navBarPage.clickEducation();
//    }

   
    public void testZoomBlog(){

        zoomBlog= topNavigation.clickZoomBlog();

    }

    @Test
    public void testVideoWebinar(){

        videoWebinars= navBarPage.clickVideoWebinars();
    }

    @Test
    public void testHealthcare(){

        healthcarePage = navBarPage.clickHealthcare();
    }

    @Test
    public void testFinance(){

        financePage = navBarPage.clickFinance();
    }

    @AfterSuite
    public void tearDown() {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}

