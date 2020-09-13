package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLead extends BaseClass{
	
	@When("Click crmsfa link")
	public void clickCrmsfa() {
		driver.findElementByLinkText("CRM/SFA").click();

	}
	
	@Then("Leads page should be displayed")
	public void verifyLeadPage() {
		System.out.println("Leads page is displayed");

	}

}
