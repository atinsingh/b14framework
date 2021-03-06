package co.pragra.testingframework.drivermanager;

import co.pragra.testingframework.config.Configuration;
import co.pragra.testingframework.config.Constants;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class manage WebDriver instance
 * How many instance of driver we needed
 */
public class DriverManager {

    private final Logger logger = LogManager.getLogger(DriverManager.class);
    private WebDriver driver;
    private static DriverManager manager;

    private DriverManager(){
        init();
        driver = createDriver();
    }

    private void init(){
        logger.log(Level.INFO, "Using executable from path {} for chrome", Configuration.getInstance().getProperty("chrome.executable"));
        System.setProperty("webdriver.chrome.driver",
                Configuration.getInstance().getProperty("chrome.executable"));
//        System.setProperty("webdriver.gecko.driver",
//                Configuration.getInstance().getProperty("firefox.executable"));
//        System.setProperty("webdriver.internetexplorer.driver",
//                Configuration.getInstance().getProperty("ie.executable"));
//        System.setProperty("webdriver.opera.driver",
//                Configuration.getInstance().getProperty("opera.executable"));
//        System.setProperty("webdriver.edge.driver",
//                Configuration.getInstance().getProperty("edge.executable"));
        // do this all broswers

    }

    /**
     * This method will create webdriver instance based on the
     * property provided.
     * @return
     */

    private WebDriver createDriver(){
        if(Configuration.getInstance().getProperty("browser").equals(Constants.CHROME)){
            logger.log(Level.INFO, "Found match for  {}  browser",Configuration.getInstance().getProperty("browser") );
            return new ChromeDriver();
        }else if(Configuration.getInstance().getProperty("browser").equals(Constants.FIREFOX)){
            return new FirefoxDriver();
        }else {
            logger.log(Level.INFO, "Not Found match for  {}  browser, returning default to CHROME",Configuration.getInstance().getProperty("browser") );

            return new ChromeDriver();
        }
    }

    private WebDriver getDriver() {
        return driver;
    }
    public static WebDriver getWebDriver(){
        if(manager==null){
            manager = new DriverManager();

        }
        return manager.getDriver();
    }
}
