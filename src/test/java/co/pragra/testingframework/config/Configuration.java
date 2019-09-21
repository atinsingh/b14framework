package co.pragra.testingframework.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;

public class Configuration {
    private  Properties properties  = new Properties();
    private static Configuration obj ;

    private Configuration(){
        try {
            FileInputStream inputStream = new FileInputStream(Paths.get( "src","test","resources","framework.properties").toFile());
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Configuration getInstance(){
        if(obj==null){
            obj = new Configuration();
        }
        return obj;
    }

    public String getProperty(String key){
        return (String)properties.get(key);
    }
}
