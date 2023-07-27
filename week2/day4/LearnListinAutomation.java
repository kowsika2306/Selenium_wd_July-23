package week2.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnListinAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//number of links stored in the list
		 System.out.println(allLinks.size());
		 System.out.println(allLinks);
		 
		 List<String> links=new ArrayList<String>();
		 for(int i=0;i<allLinks.size();i++) {
			 String text = allLinks.get(i).getText();
			 links.add(text);			 
		 }
		System.out.println(links);
	}

}
