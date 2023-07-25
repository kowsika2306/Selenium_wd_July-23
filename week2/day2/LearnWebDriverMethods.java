package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethods {

	public static void main(String[] args) {
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
	WebElement cName=driver.findElement(By.id("createLeadForm_companyName"));
	cName.sendKeys("Testleaf");
	String attId = cName.getAttribute("id");
	String typedText = cName.getAttribute("value");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.className("smallSubmit")).click();
	
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
        System.out.println(text);
       
     if(text.contains(typedText)){
    	 System.out.println("text are matching");
     }else {
    	 System.out.println("text are not matching");
     }
	}

}
