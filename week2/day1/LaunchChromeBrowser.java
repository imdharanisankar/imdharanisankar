package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeBrowser {
public static void main(String[] args) {
	// Launch the browser first
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driver = new FirefoxDriver();
	// Load the url in it
	driver.get("http://leaftaps.com/opentaps/");
	
	// Implicit wait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	// To maximise the browser
	driver.manage().window().maximize();
	
	// To find the element
	WebElement eleUsername = driver.findElementById("username");
	eleUsername.sendKeys("Demosalesmanager");
	
	driver.findElementById("password").sendKeys("crmsfa");
	
	driver.findElementByClassName("decorativeSubmit").click();
	
	driver.findElementByLinkText("CRM/SFA").click();
	
	driver.findElementByLinkText("Leads").click();
	
	driver.findElementByLinkText("Create Lead").click();
	
	//driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
	
	// Type - I => Simple drop down handling
	
	// driver.findElementById("createLeadForm_dataSourceId").sendKeys("Partner");
	
	// Type - II => Handling using Select class
	
	WebElement elementDropDown = driver.findElementById("createLeadForm_dataSourceId");
	
	Select obj = new Select(elementDropDown);
	
	// Select using visible text
	// obj.selectByVisibleText("Direct Mail");
	
	// Select using Index
	// obj.selectByIndex(4);
	
	// Select using value
	obj.selectByValue("LEAD_WEBSITE");
	
	
	
	
	
	
	
	

}
}
