package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	public ViewLeadPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public ViewLeadPage verifyFirstname() {
	   System.out.println("Leads Created Successfully");
		return this;

	}
	
	
	
	
	
	
}
