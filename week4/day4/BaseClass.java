package week4.day4;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {

	public ChromeDriver driver;
	public String filename;

	@Parameters({ "url", "username", "password" })
	@BeforeMethod
	public void preConditions(String url, String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

	}

	@AfterMethod
	public void postConditions() {
		driver.close();

	}

	@DataProvider
	public String[][] sendData() throws IOException {

		// Creating object for the class ReadExcel ->call the readExcel()
		ReadExcel re = new ReadExcel();
		String[][] data = re.readExcel(filename);
		return data;

	}

	// Xml--> @DataProvider--->@BeforeMethod -->@Test

}
