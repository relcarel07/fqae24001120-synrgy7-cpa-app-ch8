package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    AndroidDriver driver;
    WebDriverWait wait;

    public LoginPage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //locator atau element
    By usernameField = AppiumBy.accessibilityId("test-Username");
    By passwordField = AppiumBy.accessibilityId("test-Password");
    By loginButton = AppiumBy.accessibilityId("test-LOGIN");
    By errorMessage = By.xpath("//*[contains(@text,'Username and password do not match any user in this service.')]");
    By logoImage = By.xpath("//android.widget.ScrollView[@content-desc=\"test-Login\"]/android.view.ViewGroup/android.widget.ImageView[1]");

    //action method
    public void inputUsername(String username){
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
    }
    public void inputPassword(String password){
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
    }
    public void clickLoginButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton)).click();
    }
    public void errorMessageisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessage)).getText();
    }
    public void logoImageisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(logoImage)).getText();
    }
}
