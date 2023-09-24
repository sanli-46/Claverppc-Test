package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(

            tags = "@SmokeTest or Regression",
            features = {"src/test/java/FeatureFiles/Register.feature"},
            glue = {"StepDefinitions"}

    )
    public class TestRunnerRegisterSteps extends AbstractTestNGCucumberTests {
}
