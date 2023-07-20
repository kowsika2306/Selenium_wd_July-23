package week1.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //global wait (Selenium wait)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(" https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");    
        driver.findElement(By.id("password")).sendKeys("Leaf@1234");
        driver.findElement(By.id("Login")).click();
        
        //java wait
        Thread.sleep(6000); //pause your execution for the given time
        String title= driver.getTitle();
        System.out.println(title);
        if(title.contains("Lightning Experience"))
        {
            System.out.println("we are successfully logged in");
        }
        else {
            System.out.println("we are not logged in");
        }
        
    }

	}


