package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutInformationPage {

    AndroidDriver driver;
    WebDriverWait wait;

    public CheckoutInformationPage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //locator atau element
    By textCheckoutInformation = By.xpath("//*[@text=\"CHECKOUT: INFORMATION\"]");
    By firstnameField = AppiumBy.accessibilityId("test-First Name");
    By lastnameField = AppiumBy.accessibilityId("test-Last Name");
    By zipField = AppiumBy.accessibilityId("test-Zip/Postal Code");
    By continueButton = AppiumBy.accessibilityId("test-CONTINUE");

    //action method
    public void checkoutInformationisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(textCheckoutInformation)).isDisplayed();
    }
    public void inputFirstname(String firstname){
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstnameField)).sendKeys(firstname);
    }
    public void inputLastname(String lastname){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastnameField)).sendKeys(lastname);
    }
    public void inputZip(String zip){
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipField)).sendKeys(zip);
    }
    public void clickContinue(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton)).click();
    }
}
