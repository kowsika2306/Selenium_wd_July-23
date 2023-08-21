package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.When;

public class LeadPage extends ProjectSpecificMethods {
	/*
	 * public LeadPage(RemoteWebDriver driver) { this.driver=driver; }
	 */
	
	@When("Click on the Create lead button")
	public CreateLeadPage clickCreateLead() {
		getDriver().findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
	
	
}
