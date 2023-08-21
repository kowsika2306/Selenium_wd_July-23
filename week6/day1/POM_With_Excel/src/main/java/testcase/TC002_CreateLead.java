package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class TC002_CreateLead extends ProjectSpecificMethods{
	
	@BeforeClass
	public void setValues() {
		filename="Lead";
	}

	@Test(dataProvider ="sendData")
	public void runCreate(String cname,String fname,String lname) {
		
		
		new LoginPage(driver).enterUsername().enterPassword().clickLogin().clickCRMSFA()
		.clickLeads().clickCreateLead().enteCompanyName(cname).enterFirstName(fname).enterLastname(lname)
		.clickCreateButton().verifyFirstname();
		
	}
	
}
