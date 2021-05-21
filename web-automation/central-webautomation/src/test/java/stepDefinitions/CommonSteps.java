package stepDefinitions;

import com.pages.LandingPage;
import com.qa.util.DriverFactory;
import io.cucumber.java.en.Given;
import org.junit.Assert;

/**
 * AUTHOR: Royce Elland Sombrano
 * PROJECT: serinoseven-automation
 * CREATED DATE: May 07, 2021
 * GOD BLESS
 */
public class CommonSteps {

    private LandingPage landingPage = new LandingPage(DriverFactory.getDriver());

    @Given("user is on landing page")
    public void user_is_on_landing_page() {
        Assert.assertEquals("https://qasrn7-central.serino.com/",landingPage.validateURL());
    }
}
