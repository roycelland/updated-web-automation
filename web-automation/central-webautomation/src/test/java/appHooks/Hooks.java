package appHooks;

import com.qa.util.DriverFactory;
import com.qa.util.UrlFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


/**
 * AUTHOR: Royce Elland Sombrano
 * PROJECT: serinoseven-central
 * CREATED DATE: April 22, 2021
 * GOD BLESS
 */
public class Hooks {

    private DriverFactory driverFactory;
    private WebDriver driver;
    private UrlFactory urlFactory;

    @Before(order = 0)
    public void launchBrowser(){
        driverFactory = new DriverFactory();
        driver = driverFactory.init_driver();
    }

    @Before(order = 1)
    public void setUrl(){
        urlFactory = new UrlFactory();
        driver.get(urlFactory.getEnvironment());

    }

    @After(order = 0)
    public void quitBrowser(){
        driver.quit();
    }

    @After(order = 1)
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            String screenshotName = scenario.getName().replaceAll(" ","_");
            byte [] sourcePath =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);
        }
    }
}
