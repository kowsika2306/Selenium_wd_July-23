package week4.day2;

import org.testng.annotations.Test;

public class LearndependsOnMethods {

	
	@Test()
	public void dcreateLead() {
			System.out.println("CreateLead");
			//explicity passed to cause failure
			throw new RuntimeException("Check the leads ");
	}

	@Test(dependsOnMethods="dcreateLead")
	public void editLead() {
		System.out.println("EditLead");

	}

	@Test()
	public void deleteLead() {
		System.out.println("DeleteLead");

	}
	
	@Test()
	public void duplicateLead() {
		System.out.println("duplicateLead");


	}
	@Test
	public void mergeLead() {
		System.out.println("duplicateLead");


	}

	//all individual testcases executed first and then the dependent will be executed
	
	
}
