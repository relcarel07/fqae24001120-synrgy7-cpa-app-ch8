package StepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutOverviewPage;

public class OverviewSteps {

    AndroidDriver driver;
    CheckoutOverviewPage checkoutOverviewPage;

    public OverviewSteps(AndroidDriver driver){
        this.driver = driver;
        this.checkoutOverviewPage = new CheckoutOverviewPage(driver);
    }

    @Given("User on the checkout overview")
    public void user_on_the_checkout_overview(){
        checkoutOverviewPage.overviewisDisplayed();
    }

    @When("User click finish button")
    public void user_click_finish_button(){
        checkoutOverviewPage.clickFinish();
    }

    @Then("User is on checkout overview")
    public void user_is_on_checkout_overview(){
        checkoutOverviewPage.overviewisDisplayed();
    }
}
