package pages;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends ProjectSpecificMethods{
	/*
	 * public ViewLeadPage(RemoteWebDriver driver) { this.driver=driver; }
	 */
	@Then("ViewLeadpage is displayed")
	public ViewLeadPage verifyFirstname() {
	   System.out.println(getDriver().getTitle());
		return this;

	}
	
	
	
	
	
	
}
