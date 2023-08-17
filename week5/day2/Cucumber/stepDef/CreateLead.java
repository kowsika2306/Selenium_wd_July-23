package stepDef;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass {

	@When("Click on Leads link")
	public void click_on_leads_link() {
		driver.findElement(By.linkText("Leads")).click();
    
	}
	@Then("CreateLeadpage is displayed")
	public void create_leadpage_is_displayed() {
		 System.out.println(driver.getTitle());
	}
	@When("Click on the Create lead button")
	public void click_on_the_create_lead_button() {
		driver.findElement(By.linkText("Create Lead")).click();

	}
	@When("Enter the company name as (.*)$")
	public void enter_the_company_name_as(String cname) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);

	}
	@When("Enter the firstname as (.*)$")
	public void enter_the_firstname_as(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);

	}
	@When("Enter the lastname as (.*)$")
	public void enter_the_lastname_as(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);

	}
	@When("Click on create lead button")
	public void click_on_create_lead_button() {
		driver.findElement(By.name("submitButton")).click();

	}
	@Then("ViewLeadpage is displayed")
	public void view_leadpage_is_displayed() {
		 System.out.println(driver.getTitle());

	}
}
