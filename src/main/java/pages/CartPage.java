package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    AndroidDriver driver;
    WebDriverWait wait;

    public CartPage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //locator atau element
    By textYourCart = By.xpath("//*[contains(@text,'YOUR CART')]");
    By checkoutButon = AppiumBy.accessibilityId("test-CHECKOUT");

    //action method
    public void textYourCartisDisplaye(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(textYourCart)).isDisplayed();
    }
    public void clickCheckoutButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkoutButon)).click();
    }
}
