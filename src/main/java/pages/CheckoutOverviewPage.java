package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutOverviewPage {

    AndroidDriver driver;
    WebDriverWait wait;

    public CheckoutOverviewPage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //locator atau element
    By textCheckoutOverview = By.xpath("//*[@text='CHECKOUT: OVERVIEW']");
    By finishButton = AppiumBy.accessibilityId("test-FINISH");

    //action method
    public void overviewisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(textCheckoutOverview)).isDisplayed();
    }
    public void clickFinish(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(finishButton)).click();
    }
}
