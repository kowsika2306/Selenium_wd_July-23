package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		
		//to handle dropdown
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));//dd element
		Select dd=new Select(source);
		dd.selectByIndex(3);
//index starts with zero
		
		WebElement marketCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mdd=new Select(marketCamp);
		mdd.selectByValue("9002");//value of the value attribute
		Thread.sleep(3000);
		mdd.selectByVisibleText("Car and Driver");//visibleText-->black color text dom
		
		
		
		
		
	}

}
