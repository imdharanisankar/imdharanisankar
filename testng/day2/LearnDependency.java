package testng.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LearnDependency {
	
	@Test
	public void createLead() {
		System.out.println("Create Lead");
		throw new NoSuchElementException();

	}

	
	@Test
	public void editLead() {
		System.out.println("Edit Lead");
	

	}
	
	
	
	
	
	
}
