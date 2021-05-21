package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * AUTHOR: Royce Elland Sombrano
 * PROJECT: serinoseven-central
 * CREATED DATE: April 22, 2021
 * GOD BLESS
 */
public class NavigationBar extends com.qa.util.CommonAction {

    private final WebDriver driver;

    private final By navCentralLogo = By.className("cmb-brand");
    private final By navCentralMarketLink = By.xpath("//*[@id='1'][1]");
    private final By navCentralEatsLink = By.xpath("//*[@id='2'][1]");
    private final By navCentralRewardLink = By.xpath("//*[@id='3'][1]");
    private final By navLoginLink = By.linkText("login or signup");
    private final By navTrackOrderLink = By.linkText("track order");
    private final By navCartLink = By.xpath("//*[@id='root']/div/nav[1]/div/div/ul/li[3]/a");

    public NavigationBar(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginSignupBtn() {
        waitAndClick(driver, navLoginLink);
    }

    public void clickEatsBtn(){
        waitAndClick(driver, navCentralEatsLink);
    }

    public void clickMarketBtn(){
        waitAndClick(driver, navCentralMarketLink);
    }

    public void clickCartBtn(){
        waitAndClick(driver, navCartLink);
    }
}
