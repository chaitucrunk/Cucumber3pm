package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= "C:\\Users\\sivak\\eclipse-workspace\\Cucumber3pm\\Features",
		glue= {"StepDefinitions"},
		plugin= {"pretty",
			"html:reports/Cucumberrpeot.html",
			"json:reports/Cucumberjson.json"
		}
		
		
		)

public class TestRunner {

}
