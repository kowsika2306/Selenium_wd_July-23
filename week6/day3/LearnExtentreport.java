package week6.day3;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentreport {

	public static void main(String[] args) throws IOException {
		
		//1.set path of the file for html report
		//including message and screenshot based on the status of the execution
		//reports folder has to be created manually under the project 
		//right the project-->click folder ->create
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		reporter.setAppendExisting(true);
		
		//step:2 generate  the physical report
		ExtentReports extent=new ExtentReports();
		//step:3 attach the repnerate report to the reporter result.html
		extent.attachReporter(reporter);
		
		
		//content  added in the generated report
		
		//adding testcasename, testdesc, who does that and what category
		ExtentTest test = extent.createTest("LoginTc","Login with Postive credentials");
		test.assignAuthor("Jagatha");
		test.assignCategory("Functional testing");
		
		test.pass("Login is successful",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/pic.jpg").build());
				
		test.fail("Login is not successful",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/pic.jpg").build());

		test.pass("Login is successful",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/pic.jpg").build());

		//mandatory to be added 
		extent.flush();
		
	}

}
