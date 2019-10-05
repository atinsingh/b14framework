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
        requestDemoPage = topNavigation.clickRequestDemoLink();
        requestDemoPage.keyInEmail("test@gmail.com")
                .and()
                .keyInCompanty("abc");
    }
    @Test
    public void testFAQ() {FaQPage faQPage = topNavigation.clickFAQ();}
    @Test
    public void testWAE() {
        WebinarsAndEvents wae = topNavigation.clickWebinaraAndEvents();
    }
    @Test
    public void testVideoTutorial() {
        VideoTutorialPage videoTutorialPage = topNavigation.clickVideoTutorial();
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
    public void testLiveTraining(){
        LiveTraining liveTraining = topNavigation.clickLiveTraining();
    }
    @Test
    public void testVideoWebinar(){
        VideoWebinars videoWebinars= navBarPage.clickVideoWebinars();
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

    }
}

