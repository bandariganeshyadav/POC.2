package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = "Features/poc.feature"
  ,glue={"StepDefs"},
  plugin = {"pretty", "html:target/saucelabs.html"},
  monochrome = true
  )

public class pocRunner {

}
