package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= 
{"src/test/java/features/Login.feature"}
,glue="stepDef",monochrome=true,publish=true)
//glue-->map the class file with feature file
//monochrome -->avoid the junk characters in the console
//publish -->generate the report
public class Runner extends AbstractTestNGCucumberTests{

}
