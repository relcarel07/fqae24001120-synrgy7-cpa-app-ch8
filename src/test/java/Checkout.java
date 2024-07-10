import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

public class Checkout {

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
    public void testCheckout(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();

        HomePage homePage = new HomePage(driver);
        homePage.clickDetail();
        homePage.clickAddBackpack();
        homePage.clickAddTshirt();
        homePage.clickCartButton();

        CartPage cartPage = new CartPage(driver);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"CONTINUE SHOPPING\"))"));
        cartPage.clickCheckoutButton();

        CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage(driver);
        checkoutInformationPage.inputFirstname("Carel");
        checkoutInformationPage.inputLastname("Putra");
        checkoutInformationPage.inputZip("1234");
        checkoutInformationPage.clickContinue();

        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(driver);
        driver.findElement(new AppiumBy.ByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"CANCEL\"))"));
        checkoutOverviewPage.clickFinish();

        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);
        checkoutCompletePage.clickBackhome();

        //add assertion text Products in HomePage is displayed
        homePage.textProductsisDisplayed();
        //add assertion text Your Cart in CartPage is displayed
        cartPage.textYourCartisDisplaye();
        //add assertion text Checkout Information in CheckoutInformationPage is displayed
        checkoutInformationPage.checkoutInformationisDisplayed();
        //add assertion text Checkout Overview in CheckoutOverviewPage is displayed
        checkoutOverviewPage.overviewisDisplayed();
        //add assertion in CheckoutCompletePage
        checkoutCompletePage.checkoutCompleteisDisplayed();
        checkoutCompletePage.thankyouForOrder();
        checkoutCompletePage.imgPony();
    }

    @AfterTest
    public void closeSession(){
        if(driver != null){
            driver.quit();
        }
    }
}
