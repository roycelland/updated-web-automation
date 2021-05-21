package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * AUTHOR: Royce Elland Sombrano
 * PROJECT: serinoseven-central
 * CREATED DATE: April 22, 2021
 * GOD BLESS
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/MarketAndEatsE2E.feature"},
        glue = {"stepDefinitions", "appHooks"},
        plugin = {"pretty"
//                ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                }
//        ,dryRun = true
)
public class CentralTestRunner {

}
