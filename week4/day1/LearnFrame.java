
package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		/*frame(index of frame) -> int
		 * frame(id_value or name_value) -> String
		 * frame(WebElement) -> WebElement
		*/
		
		WebElement eleFrame = driver.findElementByClassName("demo-frame");
		// Go inside frame -> frame(WebElement)
		//driver.switchTo().frame(eleFrame);
		
		// Go inside frame -> frame()
				driver.switchTo().frame(0);
		//perform action 
		driver.findElementByXPath("//li[text()='Item 3']").click();
		
		// come out of the frame -> go to main HTML 
		driver.switchTo().defaultContent();
		
		//
		driver.switchTo().parentFrame();
		
		driver.findElementByLinkText("Download").click();
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
