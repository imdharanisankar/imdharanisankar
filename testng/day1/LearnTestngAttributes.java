package testng.day1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnTestngAttributes {
	
		
	@Test(priority=1,invocationCount=5)    //first
	public void createLead() {
		System.out.println("create lead");

	}
	
	@Test(enabled=false,priority=2) //second
	public void editLead() {
		System.out.println("edit lead");
	}

	
	@Test(priority=3)  //third
	public void deleteLead() {
		System.out.println("delete lead");
	}
	
	
}
