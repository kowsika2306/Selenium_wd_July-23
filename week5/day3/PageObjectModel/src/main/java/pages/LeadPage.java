package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LeadPage extends ProjectSpecificMethods {

	public LeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public CreateLeadPage clickCreateLead() {
		return new CreateLeadPage(driver);
	}
	
	
}
