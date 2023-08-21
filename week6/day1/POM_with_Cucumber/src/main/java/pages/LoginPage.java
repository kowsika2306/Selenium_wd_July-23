package pages;

import org.openqa.selenium.By;


import base.ProjectSpecificMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods{
	
	/*
	 * public LoginPage(RemoteWebDriver driver) { this.driver=driver; }
	 */	

	@Given("Enter the username")
	public LoginPage enterUsername() {
		getDriver().findElement(By.id("username")).sendKeys("demoSalesManager");
		//LoginPage lp=new LoginPage();
		//return new LoginPage();
		return this; //this represents the current class object/constructor
	}

	@Given("Enter the password")
	public LoginPage enterPassword() {
		getDriver().findElement(By.id("password")).sendKeys("crmsfa");
		//LoginPage lp=new LoginPage();
		//return new LoginPage();
		return this;
	}

	@When("Click on the Login button")
	public WelcomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
	//	WelcomePage wp=	new WelcomePage();
		return 	new WelcomePage();
	}

}
