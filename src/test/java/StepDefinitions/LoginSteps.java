package StepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

    AndroidDriver driver;
    LoginPage loginPage;

    public LoginSteps(AndroidDriver driver){
        this.driver = driver;
        this.loginPage = new LoginPage(driver);
    }

    @Given("User is on Login Page")
    public void user_is_on_login_page(){

    }
    @And("User input username with {string}")
    public void user_input_username(String username){
        loginPage.inputUsername(username);
    }
    @And("User input password with {string}")
    public void user_input_password(String password){
        loginPage.inputPassword(password);
    }
    @When("User click login button")
    public void user_click_login_button(){
        loginPage.clickLoginButton();
    }
    @Then("User should see an error message")
    public void user_should_see_an_error_message(){
        loginPage.errorMessageisDisplayed();
    }
}
