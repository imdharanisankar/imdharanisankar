package webex.sessions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leafground.com/pages/table.html");
		
		List<WebElement> rows = driver.findElementsByXPath("//table[@id='table_id']//tr");
		
		System.out.println(rows.size());
		
			
		for (int i = 2; i <= rows.size(); i++) {
			
			
			List<WebElement> cells = driver.findElementsByXPath("//table[@id='table_id']//tr["+i+"]/td");
					
			
			for (int j = 1; j <= cells.size(); j++) {
				
				String text = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td["+j+"]").getText();
				
				System.out.println(text);
			}
			
				System.out.println("*************************************");
			
		}
		
		
	}

}
