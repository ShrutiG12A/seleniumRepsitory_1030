package assignment.programs.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnCloseTwoWindows
{
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/6");
	Thread.sleep(20000);
	driver.findElement(By.id("compare")).click();
	
	  Set<String> allwindowids = driver.getWindowHandles();
	  
	  for(String id:allwindowids)
	  {
		String url = driver.switchTo().window(id).getCurrentUrl();
		if(url.equals("https://www.flipkart.com/")||url.equals("https://www.amazon.in/"))
		{
			driver.close();
		}
	  }
	  
	 
	 
	  
	  
	  
	  
}
}
