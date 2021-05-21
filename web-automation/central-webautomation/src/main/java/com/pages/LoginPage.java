package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * AUTHOR: Royce Elland Sombrano
 * PROJECT: serinoseven-central
 * CREATED DATE: April 22, 2021
 * GOD BLESS
 */
public class LoginPage extends com.qa.util.CommonAction {

    private final WebDriver driver;

    //Object Repository
    private final By emailTxt = By.name("email");
    private final By passwordTxt = By.name("password");
    private final By loginBtn = By.xpath("//button[text()='LOGIN']");
    private final By forgotPasswordLink = By.linkText("FORGOT PASSWORD?");
    private final By registerBtn = By.linkText("SIGN UP HERE");

    //Constructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Action Repository
    public String getLoginPageUrl(){
        return getURL(driver);
    }

    public void enterUsername(String username){
        driver.findElement(emailTxt).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(emailTxt).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(loginBtn).click();
    }
}
