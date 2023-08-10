package week4.day4;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

//set the attribute dataProvider -->get the data from the @DataProvider
	@Test(dataProvider = "sendData")
	public void runCreate(String cname, String fname, String lname) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();

	}

	@BeforeTest //or @BeforeClass
	public void setValues() {
		filename = "Lead";
	}
}

// to supply the data to the @test method

//two dimentional data to pass into test steps
// String[][] data = new String[2][3];

// data[0][0] = "Testleaf"; data[0][1] = "Vidya"; data[0][2] = "R";

// data[1][0] = "TCS"; data[1][1] = "Ramya"; data[1][2] = "CS";
