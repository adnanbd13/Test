package TestNGRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGRunner {
	@CucumberOptions(
			features = "Feature"
			,glue="Stepdefs"
			)
	 
	public class TestRunner extends AbstractTestNGCucumberTests {
	 
	}
}
