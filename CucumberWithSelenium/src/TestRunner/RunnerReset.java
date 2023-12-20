package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)    //tells about test runner class to start execute our tests.
@CucumberOptions(           // use to set properties for cucumber.

		features = {"Features/Reset.feature"},
		glue ={"StepDefination/ResetCredentials.java"},
		//plugin ="html:target",
		dryRun = true,
		monochrome = false
		)
public class RunnerReset {

}

