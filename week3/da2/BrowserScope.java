package week3.da2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserScope {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		int i = 10;
		//ClassName ob = new ClassName();
		WebDriver  w_driver = new ChromeDriver();// -> 2

		RemoteWebDriver r_driver = new ChromeDriver();// -> 3

		ChromeDriver c_driver = new ChromeDriver();// -> 4
		
		c_driver.get("http://leaftaps.com/opentaps/control/main");

		w_driver.findElement(By.id("Value")).click();
		
		r_driver.findElementById("Value").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
