package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;



public class ProjectSpecificMethods {
	
	public RemoteWebDriver driver;
	public String filename;
	
	@Parameters({"browser","url"})
	@BeforeMethod
	public void preCondition(String browser ,String url) {
		if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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

}
