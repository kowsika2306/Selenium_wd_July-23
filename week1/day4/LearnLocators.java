package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		//findElement will locate the element which is first match in the dom
		username.sendKeys("demoSalesManager"); //to type inside the text box
		driver.findElement(By.id("password")).sendKeys("crmsfa");		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//to get the title of the page
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Leaftaps")) {
			System.out.println("We are in the right page");
		}
		else {
			System.out.println("We are not in the right page");
		}	
		
		//the element having <a> will be located with linkText/partialLinktext
		driver.findElement(By.partialLinkText("CRM")).click();
		
	//	driver.findElement(By.id("ext-gen599")).click();
    //org.openqa.selenium.NoSuchElementException:
		
		driver.findElement(By.linkText("Leads")).click();
		driver.close();
		
	}

}
