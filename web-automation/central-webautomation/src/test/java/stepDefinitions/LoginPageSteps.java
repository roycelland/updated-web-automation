package stepDefinitions;

import com.pages.LoginPage;
import com.pages.NavigationBar;
import com.qa.util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

/**
 * AUTHOR: Royce Elland Sombrano
 * PROJECT: serinoseven-central
 * CREATED DATE: April 22, 2021
 * GOD BLESS
 */
public class LoginPageSteps {

    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private NavigationBar navigationBar = new NavigationBar(DriverFactory.getDriver());
    private static String actualUrl;

    @When("user click login or signup link")
    public void user_click_login_or_signup_link() {
        navigationBar.clickLoginSignupBtn();
    }

    @When("user gets the url of login page")
    public void user_gets_the_url_of_login_page() {
        actualUrl = loginPage.getLoginPageUrl();
    }

    @Then("page url should be {string}")
    public void page_url_should_be(String expectedUrl) {
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }

    @When("user input username {string}")
    public void user_input_username(String username) {
        loginPage.enterUsername(username);
    }

    @When("user input password {string}")
    public void user_input_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("user click Login button")
    public void user_click_login_button() {
        loginPage.clickLogin();
    }
}
