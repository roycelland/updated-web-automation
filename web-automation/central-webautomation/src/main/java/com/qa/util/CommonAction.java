package com.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * AUTHOR: Royce Elland Sombrano
 * PROJECT: serinoseven-automation
 * CREATED DATE: May 05, 2021
 * GOD BLESS
 */
public abstract class CommonAction {

    public String getURL(WebDriver driver) {
        return driver.getCurrentUrl();
    }

    public void waitAndSendKeys(WebDriver driver, By elem, String info) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elem));
        driver.findElement(elem).sendKeys(info);
    }

    public void waitAndClick(WebDriver driver, By elem) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        driver.findElement(elem).click();
    }

    public void waitAndClickWebelement(WebDriver driver, WebElement elem) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(elem));
        JavascriptExecutor j = (JavascriptExecutor) driver;
        j.executeScript("arguments[0].click", elem);
    }

    public void waitElementUntilVisible(WebDriver driver, By elem) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elem));
    }
}
