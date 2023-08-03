package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnttoScroll {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement contact = driver.findElement(By.xpath("(//a[text()='Contact Us'])[2]"));		
		Actions act =new Actions(driver);
	//	act.moveToElement(contact).perform();
		act.scrollByAmount(0,1300).perform();
	
		

	}

}
