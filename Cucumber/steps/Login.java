package steps;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass{
	
	/*
	 * @Given("Launch the chrome browser") public void launch_the_chrome_browser() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); }
	 * 
	 * 
	 * @Given("Load the application url (.*)") public void
	 * load_the_application_url(String url) { driver.get(url);
	 * 
	 * }
	 */

	@Given("Enter the username as (.*)")
	public void enter_the_username_as_demosalesmanager(String uName) {
		
		driver.findElementById("username").sendKeys(uName);
	    
	}

	@Given("Enter the password as (.*)")
	public void enter_the_password_as_crmsfa(String pWord) {
		driver.findElementById("password").sendKeys(pWord);
	   
	}

	@When("Click login button")
	public void click_login_button() {
		driver.findElementByClassName("decorativeSubmit").click();
	    
	}

	@Then("Homepage should be displayed")
	public void homepage_should_be_displayed() {
		
		System.out.println("homepage");
	    
	}
	
	@But("Error message should be displayed")
	public void errorMessage() {
		System.out.println("error displayed");

	}

	
	
}
