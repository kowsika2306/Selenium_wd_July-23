package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));
		fromStation.clear();
		fromStation.sendKeys("MAS", Keys.TAB);

		WebElement toStation = driver.findElement(By.id("txtStationTo"));
		toStation.clear();
		toStation.sendKeys("MDU", Keys.TAB);

		driver.findElement(By.id("chkSelectDateOnly")).click();

		driver.findElement(By.id("buttonFromTo")).click();
		Thread.sleep(3000);
		//using forEach loop
		
		List<WebElement> secondColumnData = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//td[2]"));
		for (WebElement eachTrainNames : secondColumnData) {
			System.out.println(eachTrainNames.getText());
		}
	}

}
