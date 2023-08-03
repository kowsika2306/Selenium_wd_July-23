package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnToHover {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));		
		Actions act =new Actions(driver);
		// to do hover action using mouse
	//	act.moveToElement(men).perform();
		act.moveToElement(men).click(men).perform();
		//xy coordinates

	}

}
