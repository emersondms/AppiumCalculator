package singleton;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriverSingleton {

    private static AppiumDriver driver = null;

    private AppiumDriverSingleton() {
    }

    public static AppiumDriver getInstance() throws MalformedURLException {
        if (driver == null) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platormName", "Android");
            capabilities.setCapability("deviceName", "09ac24a3028152d3");
            capabilities.setCapability("platformVersion", "6.0.1");
            capabilities.setCapability("app", "/home/emersondms/ADS/Test/AppiumCalculator/Calculator.apk");
            capabilities.setCapability("appPackage", "com.android2.calculator3");
            capabilities.setCapability("appActivity", "com.xlythe.calculator.material.Theme.Orange");

            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        return driver;
    }
}
