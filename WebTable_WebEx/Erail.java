package webex.sessions;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		
		List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");
		
		System.out.println(rows.size());
		
		Set<String> trainNumbers = new TreeSet<String>();
			
		for (int i = 1; i <= rows.size(); i++) {
										
				String text = driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td").getText();
				
				System.out.println(text);
				
				trainNumbers.add(text);
			
			
		}
		
		for (String eachNumber : trainNumbers) {
			
			System.out.println(eachNumber);
			
		}
		
		
		
		
		
		
	}

}
