package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "Testcase123",
		glue = "stepdefinition",
		dryRun = false,
		tags = "@positive or @negative",
		monochrome = true,
		plugin = {"pretty","junit:target/nitesh/demo.xml"}
			
)
public class Runner 
{
//emty
}

//html/json/xml
