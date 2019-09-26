package cucumberOption;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

//Thay ten class can chay DataTable.feature , tags = {"@LogInNewTheme" }
@CucumberOptions(features = "src/test/java/features", glue = { "stepDefinitions" }, monochrome = true, plugin = { "pretty", "html:target/site/cucumber-reports",
				"json:target/site/cucumber.json" })

public class TestRunner {

}