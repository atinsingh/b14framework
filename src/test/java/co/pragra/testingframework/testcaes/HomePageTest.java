package co.pragra.testingframework.testcaes;
import co.pragra.testingframework.config.Configuration;
import co.pragra.testingframework.data.ExcelDataProvider;
import co.pragra.testingframework.data.StaticDataProvider;
import co.pragra.testingframework.drivermanager.DriverManager;
import co.pragra.testingframework.pages.FaQPage;
import co.pragra.testingframework.pages.HomePage;
import co.pragra.testingframework.pages.RequestDemoPage;
import co.pragra.testingframework.pages.TopNavigation;
import co.pragra.testingframework.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class HomePageTest {
    WebDriver driver;
    TopNavigation topNavigation;
    RequestDemoPage requestDemoPage;
    NavBarPage navBarPage;
    MeetingsAndChat meetingsAndChat;
    FinancePage financePage;
    JoinMeetingPage joinMeetingPage;
    SignInPage signInPage;
    SignUpPage signUpPage;
    FooterPage footerPage;
    SalesPage salesPage;
    SupportPhonePage supportPhonePage;
    ContactSalesPage contactSalesPage;
    PlansPricingPage plansPricingPage;


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
        footerPage = new FooterPage(driver);
    }

    @Test
    public void testRequestDemo() {
    // independent - of how you want data
    //
    @Test(dataProvider = "companyDataProvider", dataProviderClass = StaticDataProvider.class)
    public void testRequestDemo(String email, String company) {
        requestDemoPage = topNavigation.clickRequestDemoLink();
        requestDemoPage.keyInEmail(email)
                .and()
                .keyInCompanty(company);
    }
    @Test
    public void testFAQ() {FaQPage faQPage = topNavigation.clickFAQ();}
    public void testFAQ() {

         faQPage = topNavigation.clickFAQ();
    }
    @Test
    public void testWAE() {
        WebinarsAndEvents wae = topNavigation.clickWebinaraAndEvents();
    }
    @Test
    public void testMarketPlace() {
       // MarketPlace mp = navBarPage.clickMarketPlace();
    }


    @Test
    public void testVideoTutorial() {

         videoTutorialPage = topNavigation.clickVideoTutorial();
    }
    @Test
    public void testDownloadZoomClient()
    {
        DownloadZoomClient downloadZoomClient = topNavigation.clickDownloadZoom();
    }
    @Test
    public void testMeetingsAndChat()
    {
        meetingsAndChat = navBarPage.clickMeetingChat();
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




    public void testEducation()
    {
        //educationSol educationsol = navBarPage.clickEducation();
    }

   
    public void testZoomBlog(){

        zoomBlog= topNavigation.clickZoomBlog();

    }

    @Test
    public void testVideoWebinar(){

        videoWebinars= navBarPage.clickVideoWebinars();
    }
    @Test
    //public void testFinancePage() throws InterruptedException{ financePage = navBarPage.clickFinance();}
    public void testFinancePage(){ financePage = navBarPage.clickFinance();}
    @Test
    public void testJoinMeetingPage() { joinMeetingPage = navBarPage.clickJoinMeeting();}
    @Test
    public void testSignInPage(){signInPage = navBarPage.clickSignIn();}
    @Test
    public void testSignUpPage(){signUpPage = navBarPage.clickSignUp();}
    @Test
    public void testSalesPage(){salesPage = footerPage.clickSalesLink();} //unable to click sales it goes to contact sales and click
    @Test
    public void testSupportPhonePage(){supportPhonePage = footerPage.clickSupportPhLink();} //pass
    @Test
    public void testContactSalesPage(){contactSalesPage = footerPage.clickContactSalesLink();}
    @Test
    public void testPlansPricingPage(){plansPricingPage = footerPage.clickPalansPricingLink();}

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

       public void testZoomBlog(){
       ZoomBlog zoomBlog= topNavigation.clickZoomBlog();


    @Test(dataProvider = "excelData", dataProviderClass = ExcelDataProvider.class)
    public void testName(String email, String company, Double num) {
        System.out.println(email);
        System.out.println(company);
        System.out.println((num.intValue()));
    }
}
}