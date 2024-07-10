package StepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import pages.CheckoutCompletePage;

public class CompleteSteps {

    AndroidDriver driver;
    CheckoutCompletePage checkoutCompletePage;

    public CompleteSteps(AndroidDriver driver){
        this.driver = driver;
        this.checkoutCompletePage = new CheckoutCompletePage(driver);
    }

    @Then("User is on checkout complete")
    public void user_is_on_checkout_complete(){
        checkoutCompletePage.thankyouForOrder();
    }

}
