package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWebDriverWait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
	
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles.size());
		
		  WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(15));
		  wait.until(ExpectedConditions.);
		 
	}

}
