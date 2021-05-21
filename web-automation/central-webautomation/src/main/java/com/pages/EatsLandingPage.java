package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * AUTHOR: Royce Elland Sombrano
 * PROJECT: serinoseven-automation
 * CREATED DATE: May 07, 2021
 * GOD BLESS
 */
public class EatsLandingPage extends com.qa.util.CommonAction {

    private final WebDriver driver;

    //Object Repository
    private final By banner = By.id("carouselExampleSlidesOnly");
    private final By brandList = By.id("srn-brand-list");
    private final By brandListBtn = By.className("srn-brand-list-logo-holder"); //srn-brand-list-item
    private final By brandListName = By.className("srn-brand-list-name");
    private final By doubleTreatBanner = By.id("srn-double-treats-component");
    private final By paydayBanner = By.id("srn-payday-component");
    private final By productTags = By.id("srn-product-tags-component");

    //Constructor
    public EatsLandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getEatsLandingPageUrl() {
        return getURL(driver);
    }

    public void selectBrand(String brandName) {
        int i = 0;
        try {
            waitElementUntilVisible(driver, brandListName);
            WebElement allButton = driver.findElement(brandList);
            List<WebElement> getButton = allButton.findElements(brandListBtn);
            List<WebElement> getName = allButton.findElements(brandListName);
            for (WebElement brand : getName) {
                String name = brand.getText();
                if (name.equalsIgnoreCase(brandName)) {
                    JavascriptExecutor executor = (JavascriptExecutor)driver;
                    executor.executeScript("arguments[0].click();", getButton.get(i));
                }
                i = i + 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
