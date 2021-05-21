package stepDefinitions;

import com.pages.EatsLandingPage;
import com.pages.NavigationBar;
import com.pages.BrandPage;
import com.qa.util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

/**
 * AUTHOR: Royce Elland Sombrano
 * PROJECT: serinoseven-automation
 * CREATED DATE: May 07, 2021
 * GOD BLESS
 */
public class MarketAndEatsE2eSteps {

    private NavigationBar navigationBar = new NavigationBar(DriverFactory.getDriver());
    private EatsLandingPage eatsLandingPage = new EatsLandingPage(DriverFactory.getDriver());
    private BrandPage brandPage = new BrandPage(DriverFactory.getDriver());

    @When("user click eats button")
    public void user_click_eats_button() {
        navigationBar.clickEatsBtn();
    }

    @When("user gets the url of eats page")
    public void user_gets_the_url_of_eats_page() {
        Assert.assertEquals("https://qasrn7-eats.serino.com/", eatsLandingPage.getEatsLandingPageUrl());
    }

    @When("user select {string}")
    public void user_select_a_brand(String brandName) throws InterruptedException {
        eatsLandingPage.selectBrand(brandName);
    }

    @Then("user gets the url of brand page")
    public void user_gets_the_url_of_brand_page() {
        String actual = brandPage.getBrandPage();
        Assert.assertEquals("https://qasrn7-eats.serino.com/products#!", actual);
    }

    @When("user select {string} as fulfillment type")
    public void user_select_as_fulfillment_type(String fulfillment) {
        brandPage.selectFulfilmentType(fulfillment);
    }

    @When("user add eats product to cart")
    public void user_add_eats_product_to_cart() {
        brandPage.addToCart();
    }

    @When("user click market button")
    public void user_click_market_button() {

    }

    @When("user gets the url of market page")
    public void user_gets_the_url_of_market_page() {

    }

    @When("user select category")
    public void user_select_category() {

    }

    @When("user add market product to cart")
    public void user_add_market_product_to_cart() {

    }

    @When("user click cart")
    public void user_click_cart() {
        navigationBar.clickCartBtn();
    }

    @When("user add quantity per item")
    public void user_add_quantity_per_item() {

    }

    @When("user select product to checkout")
    public void user_select_product_to_checkout() {

    }

    @When("user select delivery date and time")
    public void user_select_delivery_date_and_time() {

    }

    @When("user fill up contact details")
    public void user_fill_up_contact_details() {

    }

    @When("user select cash as payment option")
    public void user_select_cash_as_payment_option() {

    }

    @When("user click place order")
    public void user_click_place_order() {

    }

    @Then("user will see the tracking order")
    public void user_will_see_the_tracking_order() {

    }

}
