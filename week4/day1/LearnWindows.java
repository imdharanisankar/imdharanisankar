
package week4.day1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String currentWindow = driver.getWindowHandle();
		System.out.println(currentWindow);
		
		
		File screenshotAs = driver.findElementById("home").getScreenshotAs(OutputType.FILE);
		
		driver.findElementById("home").click();
		// get all window info -> for each new Window Open
		
		Set<String> allWindows = driver.getWindowHandles();// -> 3
		List<String> listOfWindow =  new ArrayList<String>(allWindows);
		//listOfWindow.addAll(allWindows);
		//get child window info
		String childWindow = listOfWindow.get(1);
		
		//switch to any window
		driver.switchTo().window(childWindow);
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		
		driver.switchTo().window(currentWindow);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		// close current browser
		//driver.close();
		// close all browser in current excution 
		//driver.quit();
		
		
		//press prtScr
		File src = driver.getScreenshotAs(OutputType.FILE);
		//create new file 
		File snap = new File("ouput.png");
		// Ctrl + V
		FileUtils.copyFile(src, snap);
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
