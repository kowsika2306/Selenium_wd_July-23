package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends ProjectSpecificMethods {
	
	/*
	 * public WelcomePage(RemoteWebDriver driver) { this.driver=driver; }
	 */
     @When("Click on CRMSFA link")
	public MyHomePage clickCRMSFA() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
     
	public LoginPage clickLogout() {
		return new LoginPage();
	}

	@Then("WelcomePage is displayed")
	public WelcomePage verifyWelcomePage() {
		String title = getDriver().getTitle();
		System.out.println(title);
		//return new WelcomePage();
		return this;
	}

}
