package co.pragra.testingframework.testcaes;

import co.pragra.testingframework.config.Configuration;
import co.pragra.testingframework.data.ExcelDataProvider;
import co.pragra.testingframework.data.StaticDataProvider;
import co.pragra.testingframework.drivermanager.DriverManager;
import co.pragra.testingframework.pages.FaQPage;
import co.pragra.testingframework.pages.HomePage;
import co.pragra.testingframework.pages.RequestDemoPage;
import co.pragra.testingframework.pages.TopNavigation;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

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


    @Test(dataProvider = "excelData", dataProviderClass = ExcelDataProvider.class)
    public void testName(String email, String company, Double num) {
        System.out.println(email);
        System.out.println(company);
        System.out.println((num.intValue()));
    }
}
