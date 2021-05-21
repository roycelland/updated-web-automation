package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.Random;

/**
 * AUTHOR: Royce Elland Sombrano
 * PROJECT: serinoseven-automation
 * CREATED DATE: May 11, 2021
 * GOD BLESS
 */
public class BrandPage extends com.qa.util.CommonAction {

    private final WebDriver driver;

    private final By deliverToBtn = By.className("cmb-logo-deliver-btn");
//    private final By searchLocationTxt = By.id("query-eats_products_page");
//    private final By banner = By.className("d-block w-100 eats-product-banner");
//    private final By brandLogo = By.className("cmb-category-logo-image");
//    private final By categoryList = By.className("cmb-categories-list");
//    private final By collectionItemList = By.xpath("//*[@class='cmb-collection-item capitalize']");
//    private final By productImg = By.className("cmb-product-img");
    private final By fulfillmentModal = By.id("fulfillmenttype_modal");
    private final By enterLocationTxt = By.id("query-ft-modal-location");
//    private final By searchLocationBtn = By.id("search-ft-modal-location");
    private final By searchResult = By.id("ui-id-2");
    private final By pickupTab = By.linkText("Pickup");
    private final By chooseStore = By.id("srn-fulfillmenttype-dropdown-store");
//    private final By changeAddressBtn = By.className("srn-ft-change-address-btn");
    private final By searchResultItem = By.className("ui-menu-item");
    private final By proceedBtn = By.xpath("//button[contains(text(), 'PROCEED')]");
    private final By confirmBtn = By.xpath("//button[contains(text(), 'CONFIRM')]");
    private final By houseNoTxt = By.id("srn-ft-house_no-ft-modal-location");
    private final By floorTxt = By.id("srn-ft-floor-ft-modal-location");
    private final By confirmAddressBtn = By.xpath("//button[contains(text(), 'CONFIRM DELIVERY ADDRESS')]");
    private final By addToCartBtn = By.className("cmb-product-add");


    public BrandPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getBrandPage() {
        return getURL(driver);
    }

    public void selectFulfilmentType(String fulfillment) {
        Random r = new Random();
        try {
            if (fulfillment.equalsIgnoreCase("DELIVERY") || fulfillment.equalsIgnoreCase("DELIVER LATER")) {
                waitAndClick(driver, deliverToBtn);
                waitElementUntilVisible(driver, fulfillmentModal);
                waitAndSendKeys(driver, enterLocationTxt, "makati");
                waitAndClick(driver, searchResult);
                waitElementUntilVisible(driver, searchResult);
                try{
                    WebElement div = driver.findElement(searchResult);
                    List<WebElement> addressList = div.findElements(searchResultItem);
                    int i =r.nextInt(addressList.size());
                    addressList.get(i).click();
                }catch (Exception e){
                    e.printStackTrace();
                }
                waitAndClick(driver, proceedBtn);
                waitAndSendKeys(driver, houseNoTxt, "123");
                waitAndSendKeys(driver,floorTxt, "123");
                waitAndClick(driver, confirmAddressBtn);
            } else if (fulfillment.equalsIgnoreCase("PICKUP")) {
                waitAndClick(driver, deliverToBtn);
                waitElementUntilVisible(driver, fulfillmentModal);
                waitAndClick(driver, pickupTab);
                waitAndClick(driver, chooseStore);
                try{
                    WebElement option = driver.findElement(chooseStore);
                    List<WebElement> selectStore = option.findElements(By.tagName("option"));
                    int o = r.nextInt(selectStore.size());
                    selectStore.get(o).click();
                }catch (Exception e){
                    e.printStackTrace();
                }
                waitAndClick(driver, confirmBtn);
            } else {
                System.out.println("NO SUCH THING AS " + fulfillment);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addToCart (){
        Random r = new Random();
        waitElementUntilVisible(driver, addToCartBtn);
        List<WebElement> productSelected = driver.findElements(addToCartBtn);
        int p = r.nextInt(productSelected.size());
        waitAndClickWebelement(driver, productSelected.get(p));
        productSelected.get(p).click();
    }

}
