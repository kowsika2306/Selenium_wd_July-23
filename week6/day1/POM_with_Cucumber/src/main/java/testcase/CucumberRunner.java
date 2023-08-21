package testcase;

import base.ProjectSpecificMethods;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"src/main/java/features/TC001_Login.feature"},glue="pages", monochrome=true)
public class CucumberRunner extends ProjectSpecificMethods{

}
