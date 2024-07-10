package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutCompletePage {

    AndroidDriver driver;
    WebDriverWait wait;

    public CheckoutCompletePage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //locator atau element
    By textCheckoutComplete = By.xpath("//*[@text='CHECKOUT: COMPLETE!']");
    By textThankYourForOrder = By.xpath("//*[@text='THANK YOU FOR YOU ORDER']");
    By imgPony = By.xpath("//*[@content-desc='test-CHECKOUT: COMPLETE!']/android.view.ViewGroup/android.widget.ImageView");
    By backhomeButton = AppiumBy.accessibilityId("test-BACK HOME");

    //action method
    public void checkoutCompleteisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(textCheckoutComplete)).isDisplayed();
    }
    public void thankyouForOrder(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(textThankYourForOrder)).getText();
    }
    public void imgPony(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(imgPony)).isDisplayed();
    }
    public void clickBackhome(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(backhomeButton)).click();
    }
}
