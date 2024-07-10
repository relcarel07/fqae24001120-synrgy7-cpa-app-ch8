package StepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;


public class CartSteps {

    AndroidDriver driver;
    CartPage cartPage;

    public CartSteps(AndroidDriver driver){
        this.driver = driver;
        this.cartPage = new CartPage(driver);
    }

    @Given("User on the shopping cart page")
    public void user_on_the_shopping_cart_page(){
        cartPage.textYourCartisDisplaye();
    }

    @When("User click checkout button")
    public void user_click_checkout_button(){
        cartPage.clickCheckoutButton();
    }

    @Then("User is on shopping cart page")
    public void user_is_on_shopping_cart_page(){
        cartPage.textYourCartisDisplaye();
    }

}
