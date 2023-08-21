package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}	

	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		//LoginPage lp=new LoginPage();
		//return new LoginPage();
		return this; //this represents the current class object/constructor
	}

	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//LoginPage lp=new LoginPage();
		//return new LoginPage();
		return this;
	}

	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	//	WelcomePage wp=	new WelcomePage();
		return 	new WelcomePage(driver);
	}

}
