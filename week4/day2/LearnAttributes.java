package week4.day2;

import org.testng.annotations.Test;

public class LearnAttributes {

	
	@Test(priority=1,invocationCount=3)
	public void createLead() {
			System.out.println("CreateLead");
	}

	@Test(priority=0,enabled=false)
	public void editLead() {
		System.out.println("EditLead");

	}

	@Test(priority=0)
	public void deleteLead() {
		System.out.println("DeleteLead");

	}
	
	@Test(priority=-3)
	public void duplicateLead() {
		System.out.println("duplicateLead");


	}
	@Test
	public void mergeLead() {
		System.out.println("duplicateLead");


	}

	
}
