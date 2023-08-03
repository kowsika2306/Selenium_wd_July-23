package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebtable {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement table = driver
				.findElement(By.xpath("//div[@class='ui-panel-content ui-widget-content']/table/tbody"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		System.out.println(row.size());

		String text = table.findElement(By.xpath("//tr[2]/td[3]")).getText();
		System.out.println(text);

		// to reterive one particular row value -->all column value of 2nd row

		List<WebElement> tableCol = driver
				.findElements(By.xpath("//div[@class='ui-panel-content ui-widget-content']/table/thead/tr/th"));
		System.out.println(tableCol.size());

		System.out.println("Vaues from second row");
		for (int i = 1; i <= tableCol.size(); i++) {
			String allcol2row = driver
					.findElement(By.xpath(
							"//div[@class='ui-panel-content ui-widget-content']/table/tbody/tr[2]/td[" + i + "]"))
					.getText();
			System.out.println(allcol2row);
		}

		System.out.println("Vaues from all rows of 1st column");
		for (int i = 1; i <= row.size(); i++) {
			String allrows1col = driver
					.findElement(By.xpath(
							"//div[@class='ui-panel-content ui-widget-content']/table/tbody/tr[" + i + "]/td[1]"))
					.getText();
			System.out.println(allrows1col);// tr[0]
		}

		System.out.println("Values from all the row and columns");

		for (int i = 1; i <= row.size(); i++) {
			for (int j = 1; j < tableCol.size(); j++) {
				String allrowsallcol = driver.findElement(By.xpath(
						"//div[@class='ui-panel-content ui-widget-content']/table/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.print(allrowsallcol + " ");
			}
			System.out.println();
		}

	}

}
