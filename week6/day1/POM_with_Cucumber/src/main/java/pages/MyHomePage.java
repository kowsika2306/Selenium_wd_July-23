package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.When;

public class MyHomePage extends ProjectSpecificMethods {

	/*
	 * public MyHomePage(RemoteWebDriver driver) { this.driver=driver; }
	 */
	@When("Click on Leads link")
	public LeadPage clickLeads() {
		getDriver().findElement(By.linkText("Leads")).click();
		return new LeadPage();
	}
}
