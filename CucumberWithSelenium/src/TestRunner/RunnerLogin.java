package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"features/Login.feature"},
		glue = {"StepDefination/Login.java"},
		dryRun = true,
		monochrome = true
		)

public class RunnerLogin {

}
