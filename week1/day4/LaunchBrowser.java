package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//step:1 instantiate the browser driver
		ChromeDriver driver=new ChromeDriver();
		//Step:2 load the url into the chrome browser
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();		
		driver.close();
		
		EdgeDriver driver1=new EdgeDriver();
		driver1.get("http://leaftaps.com/opentaps/control/login");
	}

}
