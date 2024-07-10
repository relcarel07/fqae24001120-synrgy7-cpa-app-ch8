import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    static AndroidDriver driver;
    static WebDriverWait wait;

    public static void setup(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","14.0");
        capabilities.setCapability("deviceName","NFLVPJ69X859RS55");
        capabilities.setCapability("app","C:/Users/ASUS/Downloads/SwagLabs.apk");
        capabilities.setCapability("automationName","UIAutomator2");
        capabilities.setCapability("appPackage","com.swaglabsmobileapp");
        capabilities.setCapability("appActivity","com.swaglabsmobileapp.MainActivity");

        driver = new AndroidDriver(capabilities);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public static void closeSession(){
        if(driver != null){
            driver.quit();
        }
    }
}
