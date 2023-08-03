package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnKeyboardEvents {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		
		Actions ac=new Actions(driver);
       //keyboard -->ctrl-->pressed down -->release it
		
		ac.keyDown(Keys.CONTROL)
		.click(item1).pause(2000)
		.click(item2).pause(2000)
		.click(item4).keyUp(Keys.CONTROL).perform();
		
		
	
	
	}
	

}
