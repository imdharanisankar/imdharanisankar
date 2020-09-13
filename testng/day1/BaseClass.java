package testng.day1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod - Parent");

	}

	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass - Parent");

	}
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest - Parent");

	}
	
}
