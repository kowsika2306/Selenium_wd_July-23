package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {

	//public ChromeDriver driver;
	//public EdgeDriver driver1;
	
	public RemoteWebDriver driver;
	
	@Parameters({"url","email","pwd","browser"})
	@BeforeMethod
	public void preCondition(String url,String email,String pwd,String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		    driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();	
		}else if(browser.equalsIgnoreCase("firefox"))
		{
		    driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pwd);
	}
	
	
	@Test
	public void runFb() {
		System.out.println(driver.getTitle());
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	
	
	
	
}
