package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="D:\\java_test\\ZZZZDemopro\\Features\\Contact.feature:17",
		glue= {"StepDefination"}
		,dryRun=false
		
		
		
		)




public class Runner {

}
