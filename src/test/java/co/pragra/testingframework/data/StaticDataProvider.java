package co.pragra.testingframework.data;

import org.testng.annotations.DataProvider;

public class StaticDataProvider {

    @DataProvider(name = "companyDataProvider")
    public Object[][] comapanyData() {
        Object[][] data = {
                {"test@gmail.com", "Netflix"}
        };
        return data;
    }
    // complete this.
//    public Object[][] fileData(){
//
//    }
}
