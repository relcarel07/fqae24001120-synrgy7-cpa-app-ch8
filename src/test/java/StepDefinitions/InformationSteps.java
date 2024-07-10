package StepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CheckoutInformationPage;

public class InformationSteps {

    AndroidDriver driver;
    CheckoutInformationPage checkoutInformationPage;

    public InformationSteps(AndroidDriver driver){
        this.driver = driver;
        this.checkoutInformationPage = new CheckoutInformationPage(driver);
    }

    @Given("User on the checkout information")
    public void user_on_the_checkout_information(){
        checkoutInformationPage.checkoutInformationisDisplayed();
    }

    @And("User input firstname {string}")
    public void user_input_firstname(String firstname){
        checkoutInformationPage.inputFirstname(firstname);
    }

    @And("User input lastname {string}")
    public void user_input_lastname(String lastname){
        checkoutInformationPage.inputLastname(lastname);
    }

    @And("User input zip {string}")
    public void user_input_zip(String zip){
        checkoutInformationPage.inputZip(zip);
    }

    @When("User click continue")
    public void user_click_continue(){
        checkoutInformationPage.clickContinue();
    }

    @Then("User is on checkout information")
    public void user_is_on_checkout_information(){
        checkoutInformationPage.checkoutInformationisDisplayed();
    }
}
