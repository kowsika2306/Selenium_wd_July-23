package week3.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundWindow {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>Win=new ArrayList<String>(windowHandles);
		driver.switchTo().window(Win.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();

		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles.size());
		List<String> winHan=new ArrayList<String>(handles);
		/*
		 * for (String string : handles) { System.out.println();
		 * System.out.println(string+":" +driver.getTitle() );
		 * driver.switchTo().window(string); System.out.println(string+":"
		 * +driver.getTitle() ); }
		 */		
		
		for (int i = 1; i < winHan.size(); i++) {
			driver.switchTo().window(winHan.get(i));
			File source = driver.getScreenshotAs(OutputType.FILE);
			// take the screenshot of the current element
			File des = new File("./snap/pic"+1+"jpg");// setting up path to save the file
			// connect the snapshot and the file
			FileUtils.copyFile(source, des);
			driver.close();
		}		
	driver.quit();
	
	}

}
