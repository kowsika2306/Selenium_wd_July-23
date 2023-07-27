package week2.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftaps {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		 List<WebElement> credentials = driver.findElements(By.className("inputLogin"));
		System.out.println(credentials.size());
		
		credentials.get(0).sendKeys("demoSalesManager");
		credentials.get(1).sendKeys("crmsfa");
		
		
		
		
		/*
		 * //findElement will locate the element which is first match in the dom
		 * username.sendKeys("demoSalesManager"); //to type inside the text box
		 * driver.findElement(By.id("password")).sendKeys("crmsfa");
		 * driver.findElement(By.className("decorativeSubmit")).click();
		 */
		

	}

}
