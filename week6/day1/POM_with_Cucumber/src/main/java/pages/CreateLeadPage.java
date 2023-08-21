package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.When;

public class CreateLeadPage extends ProjectSpecificMethods {

	/*
	 * public CreateLeadPage(RemoteWebDriver driver) { this.driver=driver; }
	*/
	
	@When("Enter the company name as {string}")
	public CreateLeadPage enteCompanyName(String cname) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}
	
	@When("Enter the firstname as {string}")
	public CreateLeadPage enterFirstName(String fname) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);

		return this;

	}
	
	@When("Enter the lastname as {string}")
	public CreateLeadPage enterLastname(String lname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;

	}
	
	@When("Click on create lead button")
	public ViewLeadPage clickCreateButton() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
	
	
}
