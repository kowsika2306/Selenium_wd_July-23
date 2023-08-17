package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {

	public CreateLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLeadPage enteCompanyName() {
		return this;
	}
	
	
	public CreateLeadPage enterFirstName() {
		// TODO Auto-generated method stub
		return this;

	}
	
	public CreateLeadPage enterLastname() {
		// TODO Auto-generated method stub
		return this;

	}
	
	
	public ViewLeadPage clickCreateButton() {
		return new ViewLeadPage(driver);
	}
	
	
}
