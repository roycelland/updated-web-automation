package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * AUTHOR: Royce Elland Sombrano
 * PROJECT: serinoseven-central
 * CREATED DATE: April 22, 2021
 * GOD BLESS
 */
public class LandingPage extends com.qa.util.CommonAction{

    private final WebDriver driver;

    private final By bannerImg = By.className("web-banner");

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    public String validateURL(){
        return getURL(driver);
    }

}
