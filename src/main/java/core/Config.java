package core;

import java.io.File;
import java.util.Properties;


/**
 * Created by bindhu on 24/09/2016.
 */
public class Config {

    File apkFile = new File("apks/BookSearch_1.0.apk");
    Properties prop = new Properties();
    public String configFilename = System.getProperty("booksearch.tests.properties.file","config.prop");

    private  String deviceName = "XT1022";
    private  String platformVersion = "5.1" ;
    private  String platformName = "Android";


    // get android apk file path
    public String getApk(){
        return  apkFile.getAbsolutePath();
    }

    // get platform name
    public String getPlatformName(){
       return platformName;
    }

    // get platform version
    public String getPlatformVersion(){
        return platformVersion;
    }

    // get device name
    public String getDeviceName(){
        return deviceName;
    }

    //get property from config.prop file
    public String getProperty(String key){
        String property = System.getProperty(key, prop.getProperty(key));
        return property;
    }

    //TO-DO this needs implementation to read all properties from config file
    public Properties getProperties(){
        return prop;
    }

}

