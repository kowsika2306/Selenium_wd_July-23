package stepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass{

	//public ChromeDriver driver;
	
	/*
	 * @Given("Launch the browser") public void launchBrowser() { driver =new
	 * ChromeDriver(); }
	 * 
	 * @Given("Load the url") public void loadUrl() {
	 * driver.manage().window().maximize();
	 * driver.get("http://leaftaps.com/opentaps/control/main");
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 * 
	 * }
	 */
	@Given("Enter the username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}	
	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);

	}
	@When("Click on the Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	
	@Then("WelcomePage is displayed")
	public void verifyWelcomePage() {
		System.out.println(driver.getTitle());
	}
	
	@But("Error message should be displayed")
	public void verifyErrormessage() {
		String error= driver.findElement(By.xpath("//p[text()='following error occurred during login: User not found.']")).getText();
	     System.out.println(error);
	}
	
	@When("Click on CRMSFA link")
	public void click_on_crmsfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	@Then("HomePage is dispalyed")
	public void home_page_is_dispalyed() {
	   System.out.println(driver.getTitle());
	}
	
	
	/*
	 * @Then("close the browser") public void tearDown() { driver.close(); }
	 */
	
	
}
