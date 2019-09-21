package co.pragra.testingframework.testcaes;

import co.pragra.testingframework.config.Configuration;
import org.testng.annotations.Test;

public class HomePageTest {

    @Test
    public void tc1(){
        Configuration obj = Configuration.getInstance();

        System.out.println(obj.getProperty("appUrl"));
        System.out.println(obj.getProperty("browser"));
    }
}
