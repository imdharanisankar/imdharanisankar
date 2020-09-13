package webex.sessions;

import java.util.ArrayList;
import java.util.Collections;
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

public class ZoomCar {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoomcar.com/chennai/search/query?lat=12.9416037&lng=80.2362096&starts=2020-09-04%2009%3A00&ends=2020-09-05%2019%3A00&type=zoom_later&bracket=no_fuel");
	
		Thread.sleep(2000);
		
		//to get the count of Car items in the page
		List<WebElement> carItems = driver.findElementsByXPath("//div[@class='car-item']");
		
		//declare Map to get the Car Name as Key and Price as Value
		Map<String,Integer> carDetails = new LinkedHashMap<String,Integer>();
		
		//Declare List to get the Car Price to identify the Highest value
		List<Integer> listCarPrice = new ArrayList<Integer>();
		
		//Iterate over the number of items and get the CarName and CarPrice
		for (int i = 1; i <= carItems.size(); i++) {
			
			//to get the carName
			String carName = driver.findElementByXPath("(//h3)["+i+"]").getText();
			
			//to get the carPrice
			String carPrice = driver.findElementByXPath("//div[@class='new-price']").getText();
			
			//to get only the numbers from the text
			String replaceAll = carPrice.replaceAll("\\D", "");
			
			//Convert the String into Integer
			int intCarPrice = Integer.parseInt(replaceAll);
		
			//Insert the carName and carPrice into Map
			carDetails.put(carName, intCarPrice);
			
			//insert carPrice into List
			listCarPrice.add(intCarPrice);
		
		}
		
		//Sort the List 
		Collections.sort(listCarPrice);
		
		//Get the highest price using last index
		listCarPrice.get(listCarPrice.size()-1); // Highest-price 5000
		
		
		
	
		Set<Entry<String, Integer>> entrySet = carDetails.entrySet();
		
		//Retrieve the each data as s set from Map
		for (Entry<String, Integer> eachEntry : entrySet) {
			
			//Check the Map value aganst the highest value in the List
			if(eachEntry.getValue()==listCarPrice.get(listCarPrice.size()-2)) {
				
				//Print the highest carName and carPrice
				System.out.println(eachEntry.getKey()+"-->"+eachEntry.getValue());
			}
			
			
			
		}
		
		
		
		
		
		
		
	}

}
