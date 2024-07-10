package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    AndroidDriver driver;
    WebDriverWait wait;

    public HomePage(AndroidDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //locator atau element
    By textProducts = By.xpath("//*[contains(@text,'PRODUCTS')]");
    By textTitleItemBackpack = By.xpath("//*[contains(@text,'Sauce Labs Backpack')]");
    By sortingButton = By.xpath("//*[@content-desc=\"test-Modal Selector Button\"]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView");
    By lowtohighButton = By.xpath("//*[contains(@text,'Price (low to high)')]");
    By itemlowFirst = By.xpath("//*[contains(@text,'$7.99')]");
    By itemlowSecond = By.xpath("//*[contains(@text,'$9.99')]");
    By cartButton = By.xpath("//*[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView");
    By detailButton = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Toggle\"]");
    By addSauceLabsBackpack = By.xpath("(//*[@text=\"+\"])[1]");
    By addSauceLabsTshirt = By.xpath("(//*[@text=\"+\"])[3]");

    //action method
    public void textProductsisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(textProducts)).isDisplayed();
    }
    public void textTitleItemBackpackisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(textTitleItemBackpack)).isDisplayed();
    }
    public void clickSortingButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(sortingButton)).click();
    }
    public void clickLowtoHighPriceButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lowtohighButton)).click();
    }
    public void priceLowFirstisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(itemlowFirst)).isDisplayed();
    }
    public void priceLowSecondisDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(itemlowSecond)).isDisplayed();
    }
    public void clickDetail(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(detailButton)).click();
    }
    public void clickAddBackpack(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(addSauceLabsBackpack)).click();
    }
    public void clickAddTshirt(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(addSauceLabsTshirt)).click();
    }
    public void clickCartButton(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(cartButton)).click();
    }
}
