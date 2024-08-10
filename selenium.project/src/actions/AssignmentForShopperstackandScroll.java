package actions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentForShopperstackandScroll {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/17");
		driver.findElement(By.id("compare")).click();

		// using the getwindowhandles we getting all the window id of that page
//	  getwindowhandles return type is set<String>
		// using for each lopoop we will iterate
		Set<String> allwindowids = driver.getWindowHandles();
		for (String id : allwindowids) {
			// transfering the driver control from one window to other
//		 calling switchto method and its return type is targetlocator
			// in switch to we have window method
//		  we are capturing the url
			String url = driver.switchTo().window(id).getCurrentUrl();
			// using contains method if its present or not
			if (url.contains("amazon"))
				break;
		}
		// maximizing the window
//	 driver.manage().window().maximize();
		Actions act = new Actions(driver);
// creating the object for actions class its return type is actions 
// and using reference variable we will call the methods of the actions class
		
		act.scrollByAmount(300, 700).perform();
//act.scrollByAmount(300, 0);
// with every method we need to call the perform method so that it will perform that action 
// perform method return type is void ;
	}
}
