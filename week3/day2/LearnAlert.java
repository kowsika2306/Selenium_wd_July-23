package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Show']")).click();		
		//UnhandledAlertException 
		
		//Alert interface
		Alert alert = driver.switchTo().alert();
		
		//Simple Alert
		System.out.println(alert.getText());
		alert.accept();
		
		//Confirmation alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		System.out.println(alert.getText());
		alert.dismiss();
		
		
		//prompt Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("Vidya");
		alert.accept();
		
		String text = driver.findElement(By.id("confirm_result")).getText();
		
		System.out.println(text);	
		
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Thread.sleep(2000);
		//sweet alert
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		
	}

}
