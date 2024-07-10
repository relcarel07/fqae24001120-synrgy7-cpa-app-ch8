package StepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomeSteps {

    AndroidDriver driver;
    HomePage homePage;

    public HomeSteps(AndroidDriver driver){
        this.driver = driver;
        this.homePage = new HomePage(driver);
    }

    @Given("User is on Homepage product")
    public void user_is_on_homepage_product(){
        homePage.textProductsisDisplayed();
    }

    @And("User click product1 add to cart")
    public void user_click_product1_add_to_cart(){
        homePage.clickAddTshirt();
    }

    @And("User click product2 add to cart")
    public void user_click_product2_add_to_cart(){
        homePage.clickAddBackpack();
    }

    @And("User click sorting button")
    public void user_click_sorting_button(){
        homePage.clickCartButton();
    }

    @When("User select price low to high")
    public void user_select_price_low_to_high(){
        homePage.clickLowtoHighPriceButton();
    }

    @When("User click cart button")
    public void user_click_cart_button(){
        homePage.clickCartButton();
    }

    @Then("Products sort by price to high")
    public void products_sort_by_price_to_high(){
        homePage.priceLowFirstisDisplayed();
    }

    @Then("User is on Homepage")
    public void user_is_on_homepage(){
        homePage.textProductsisDisplayed();
    }
}
