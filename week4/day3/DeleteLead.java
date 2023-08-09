package week4.day3;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DeleteLead extends BaseClass{
	
	//@Test(invocationCount=3,threadPoolSize=2,invocationTimeOut = 3000)
	//packagename.classname.methodname
    @Test(dataProvider="sendData")//(dependsOnMethods ={"week4.day2.CreateLead.runCreate"})
	public  void runDelete(String phno) throws InterruptedException {
		System.out.println(Thread.currentThread().getId());
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		
		
}
     
    
    
    @DataProvider
	public String[][] sendData() {
		//two dimentional data to pass into test steps
		String[][] data=new String[2][1];
		data[0][0]="99";
		
		data[1][0]="91";
		
		return data;
		
		
	}
	
	
    
    
    
    
    
}






