package week2.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones", Keys.ENTER);
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> nwPriceList=new ArrayList<Integer>();
		for(int i=0;i<price.size();i++) {
			String text = price.get(i).getText();
			//text -->number
			//java.lang.NumberFormatException
			String replace = text.replace(",", "");
			int parseInt = Integer.parseInt(replace);
			nwPriceList.add(parseInt);			 
		 }	
		
		Collections.sort(nwPriceList);
		System.out.println(nwPriceList);
		System.out.println(nwPriceList.get(0));
	 
	}

}
