import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class FailedLoginWrongPassword {

    AndroidDriver driver;

    @BeforeTest
    public void setUp(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","14.0");
        capabilities.setCapability("deviceName","NFLVPJ69X859RS55");
        capabilities.setCapability("app","C:/Users/ASUS/Downloads/SwagLabs.apk");
        capabilities.setCapability("automationName","UIAutomator2");
        capabilities.setCapability("appPackage","com.swaglabsmobileapp");
        capabilities.setCapability("appActivity","com.swaglabsmobileapp.MainActivity");

        driver = new AndroidDriver(capabilities);
    }

    @Test
    public void testFailedLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("user");
        loginPage.clickLoginButton();

        //add assertion to error message is displayed
        loginPage.errorMessageisDisplayed();
        //add assertion logo is displayed
        loginPage.logoImageisDisplayed();
    }

    @AfterTest
    public void closeSession(){
        if(driver != null){
            driver.quit();
        }
    }
}
