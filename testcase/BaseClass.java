package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	RemoteWebDriver driver;
	
	public String excelFileName;
	
	//order doesn't matter, but the names should exactly matches
	@Parameters({"username","password"})
	@BeforeMethod
	public void preCondition(String uName,String pWord) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys(uName);
		driver.findElementById("password").sendKeys(pWord);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();

	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();

	}
	
	
	
	@DataProvider
	public String[][] sendData() throws IOException {
		
		ReadExcelData red = new ReadExcelData();
		
		String[][] data = red.readData(excelFileName);
		
		
		/*
		 * String[][] data = new String[3][3];
		 * 
		 * data[0][0] = "TestLeaf"; data[0][1] = "Hari"; data[0][2] = "R";
		 * 
		 * data[1][0] = "TL"; data[1][1] = "Naveen"; data[1][2] = "E";
		 * 
		 * data[2][0] = "TL"; data[2][1] = "Sam"; data[2][2] = "D";
		 */
		 
		return data;

	}
	
	
	

}
