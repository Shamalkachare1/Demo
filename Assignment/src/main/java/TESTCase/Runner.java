package TESTCase;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "src/main/resources/test.feature",
   //path of step definition file
   glue = {"pages.StepDefinition.Steps.java"}
   )
public class Runner {
}