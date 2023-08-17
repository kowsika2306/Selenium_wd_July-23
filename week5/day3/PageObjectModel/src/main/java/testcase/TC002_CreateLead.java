package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC002_CreateLead extends ProjectSpecificMethods{

	@Test
	public void runCreate() {
		
		
		new LoginPage(driver).enterUsername().enterPassword().clickLogin().clickCRMSFA()
		.clickLeads().clickCreateLead().enteCompanyName().enterFirstName().enterLastname()
		.clickCreateButton().verifyFirstname();
		
	}
	
}
