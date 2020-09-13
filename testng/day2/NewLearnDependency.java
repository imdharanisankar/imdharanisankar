package testng.day2;

import org.testng.annotations.Test;

public class NewLearnDependency {
	
	//packageName.ClassName.methodName
	
	@Test(alwaysRun = true )
	public void deleteLead() {
		System.out.println("Delete Lead");

	}

}
