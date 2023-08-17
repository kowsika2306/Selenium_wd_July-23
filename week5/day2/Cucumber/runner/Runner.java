package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.testng.CucumberOptions;
import stepDef.BaseClass;

@CucumberOptions(features= 
{"src/test/java/features"}
,glue="stepDef",monochrome=true,publish=true,
//tags="@Revathy" //given at feature leavel ..executes all the feature file with @Revathy
//tags ="@Smoke" //execute all the scenarios with @Smoke 
//tags="@Smoke and @Funtional" //executes the scenarios with both conditions to be true
//tags="@Smoke or @Funtional" //executes the scenarios with either @Smoke or @Funtional 
tags="@Funtional" ,dryRun=true) //snippets = SnippetType.CAMELCASE)
//glue-->map the class file with feature file
//monochrome -->avoid the junk characters in the console
//publish -->generate the report
public class Runner extends BaseClass{

	
	/*
	 * @DataProvider(parallel=true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */
	
}
 