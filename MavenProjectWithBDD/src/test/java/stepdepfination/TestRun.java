package stepdepfination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\eclipse-workspace\\MavenProjectWithBDD\\Features\\login.feature",
glue = "stepdepfination",
				
		monochrome=true
		)
public class TestRun {

}
