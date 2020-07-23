package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "E:\\CRMApplication-master\\Features\\Companies.feature"
	,glue = "StepDefination"
	,dryRun = true
	,monochrome = true
	,tags = {"@CurrentTest"}
		)
public class RCCompanies {

}
