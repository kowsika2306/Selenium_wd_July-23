package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		//take you completely out of the frame to access the other elements in to the wabpage
		
		//nested frame
		driver.switchTo().frame(2);//outer frame
		driver.switchTo().frame(0);//inner frame -->index starts with zero
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();

		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		System.out.println(findElements.size());
		
		driver.switchTo().parentFrame();//take you to the immediate  outer frame(parentFrame)
		
		

	}

}
