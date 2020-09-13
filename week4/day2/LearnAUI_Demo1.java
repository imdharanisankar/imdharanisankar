
package week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAUI_Demo1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement eleFrame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(eleFrame);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item2 = driver.findElementByXPath("//li[text()='Item 4']");
		int x = item2.getLocation().getX();
		int y = item2.getLocation().getY();
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(item1, x, y).perform();
		
		
		
		
		
		
		
		
		/*//click and Hold
		WebElement eleDraggable = driver.findElementById("draggable");
		WebElement eleDroppable = driver.findElementById("droppable");
		
		Point location = eleDroppable.getLocation();// x and y
		int x = location.getX();
		int y = location.getY();
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(eleDraggable, eleDroppable).perform();
		builder.dragAndDropBy(eleDraggable, 100, 100).perform();*/
	}
	
}

















