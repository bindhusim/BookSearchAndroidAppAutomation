package core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.net.URL;

/**
 * Created by bindhu on 23/09/2016.
 * This Driver class adds android capabilities
 */
public  class Driver extends Config {

   public static AndroidDriver driver;
    public  AppiumDriver getAndriodDriver() throws InterruptedException, IOException {
        URL appiumUrl = new URL("http://127.0.0.1:4723/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, getDeviceName());
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,getPlatformVersion());
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,getPlatformName());
        capabilities.setCapability(MobileCapabilityType.APP, getApk());
        capabilities.setCapability("no-reset", true);
        capabilities.setCapability("full-reset", false);
        driver = new AndroidDriver(appiumUrl, capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return driver;
    }


    public void quit(){
        if(driver != null){
            driver.quit();
        }
    }

}
