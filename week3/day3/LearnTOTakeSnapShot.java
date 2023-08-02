package week3.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTOTakeSnapShot {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		System.out.println(driver);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parentWindow = driver.getWindowHandle();
		WebElement open = driver.findElement(By.xpath("//span[text()='Open']"));

		// 3 lines of code->Snapshot
		File screenShot = driver.getScreenshotAs(OutputType.FILE);
		// take the screenshot of the current webpage
		File destn = new File("./snap/pic.jpg");// setting up path to save the file
		// connect the snapshot and the file
		FileUtils.copyFile(screenShot, destn);
		// to view the file in the project-->After execution -->refresh the project
		// right click on the img file and opn with system editor

		// 3 lines of code->Snapshot webele.getScreenshotAs(OutputType.FILE);
		File source = open.getScreenshotAs(OutputType.FILE);
		// take the screenshot of the current element
		File des = new File("./snap/pic1.jpg");// setting up path to save the file
		// connect the snapshot and the file
		FileUtils.copyFile(source, des);
		// to view the file in the project-->After execution -->refresh the project
		// right click on the img file and opn with system editor


	
	}

}
