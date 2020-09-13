package webex.sessions;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnMap {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MS");
		driver.findElement(By.id("txtStationFrom")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("NMKL");
		driver.findElement(By.id("txtStationTo")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> rows = driver.findElementsByXPath("//table[@Class='DataTable TrainList TrainListHeader']//tr");
		
		Map<String,String> trainDetails = new LinkedHashMap<String,String>();
		
		for (int i = 1; i <= rows.size(); i++) {
			
			String trainNo = driver.findElementByXPath("//table[@Class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[1]").getText();
			
			String trainName = driver.findElementByXPath("//table[@Class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]").getText();
		
			trainDetails.put(trainNo, trainName);
		
		}
		
		
		
		
		Set<Entry<String, String>> entrySet = trainDetails.entrySet();
		
		for (Entry<String, String> eachEntry : entrySet) {
			
			
			System.out.println(eachEntry.getKey()+"-->"+eachEntry.getValue());
			
		}
		
		
		
		
		
		
		
	}

}
