package demo.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToChildWindowUsingMethods
{
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/products_page/10");
	Thread.sleep(20000);
// 1.capture the parent window id 
	  String parentid = driver.getWindowHandle();
// navigate to the child window
	  driver.findElement(By.id("compare")).click();
	  // call the method 
	  switchToWindow(driver,"compare");
	  // control will again comeback to the caller method then capture the title
	  
	 String title = driver.getTitle();
	 System.out.println(title);
	 driver.close();
	// switching again to parent window 
	 driver.switchTo().window(parentid);
	 Thread.sleep(10000);
	 driver.close();
	  
}

public static void switchToWindow(WebDriver driver,String passedUrl)
{
	// capture all the window ids
	  Set<String> allwindowids = driver.getWindowHandles();
	  // iterate using for each loop for comparison
	  
	  for(String id:allwindowids)
	  {
		 String acturl = driver.switchTo().window(id).getCurrentUrl();
		 if(acturl.contains("flipkart"))
			 break;
	  }
}
}
