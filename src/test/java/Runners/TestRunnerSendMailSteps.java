package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            tags = "@SmokeTest or Regression",
            features = {"src/test/java/FeatureFiles/SendMail.feature"},
            glue = {"StepDefinitions"}

    )
    public class TestRunnerSendMailSteps extends AbstractTestNGCucumberTests{


}
