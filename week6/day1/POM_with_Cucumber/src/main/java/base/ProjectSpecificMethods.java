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

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.ReadExcel;



public class ProjectSpecificMethods extends AbstractTestNGCucumberTests{
	
	private static final ThreadLocal<RemoteWebDriver> rddriver=new ThreadLocal<RemoteWebDriver>();
		
	public RemoteWebDriver getDriver() {
		return rddriver.get();
	}
	
	public void setDriver() {
		rddriver.set(new ChromeDriver());
	}	
	
	//public RemoteWebDriver driver;
	public String filename;
		
	@BeforeMethod
	public void preCondition() {
	    setDriver();
	    getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}	
	
	

	@AfterMethod
	public void postConditions() {
		getDriver().close();
	}
	
	
	
	@DataProvider
	public String[][] sendData() throws IOException {

		// Creating object for the class ReadExcel ->call the readExcel()
		ReadExcel re = new ReadExcel();
		String[][] data = re.readExcel(filename);
		return data;

	}

}
