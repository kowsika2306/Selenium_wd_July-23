package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {
	
	public WelcomePage(ChromeDriver driver) {
		this.driver=driver;
	}

	public MyHomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}

	public LoginPage clickLogout() {
		return new LoginPage(driver);
	}

	public WelcomePage verifyWelcomePage() {
		String title = driver.getTitle();
		System.out.println(title);
		//return new WelcomePage();
		return this;
	}

}
