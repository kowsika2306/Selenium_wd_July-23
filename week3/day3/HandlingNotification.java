package week3.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotification {

	public static void main(String[] args) {
		//Notification from the browser
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");		
		ChromeDriver driver = new ChromeDriver(opt);
		System.out.println(driver);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

	}

}
