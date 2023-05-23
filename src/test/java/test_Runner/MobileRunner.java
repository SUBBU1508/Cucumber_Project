package test_Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:/subbu2/subbu/src/test/resources/MobileApp.feature",
		glue="step_definition",
		plugin= {"pretty"},
		monochrome=true,
		tags="@white"
		)

public class MobileRunner {

}
