package com.qa.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * AUTHOR: Royce Elland Sombrano
 * PROJECT: serinoseven-central
 * CREATED DATE: April 22, 2021
 * GOD BLESS
 */
public class DriverFactory {

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    /**
     * This method is used to initialize the ThreadLocal driver on the basis of given browser
     */
    public WebDriver init_driver() {
        String browser = System.getProperty("browser");

        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());
        } else if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            tlDriver.set(new FirefoxDriver());
        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            tlDriver.set(new EdgeDriver());
        } else {
            System.out.println("BROWSER IS INVALID");
        }

        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();

        return getDriver();
    }

    /**
     * This is used to get the driver with ThreadLocal
     */
    public static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }

}
