package co.pragra.testingframework.testcaes;

import co.pragra.testingframework.config.Configuration;
import co.pragra.testingframework.drivermanager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePageTest {

    @Test
    public void tc1(){
        WebDriver driver = DriverManager.getWebDriver();
        driver.get(Configuration.getInstance().getProperty("appUrl"));
    }
}
