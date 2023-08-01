package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe=['dummy-chat-button-iframe']")));//frame index starts with zero
		Actions a=new Actions(driver);
		a.scrollByAmount(100, 200);

		driver.findElement(By.xpath("//button[contains(@class,'chat-toggle chat-toggle')]")).click();
		
		//NoSuchElementException
	}

}
