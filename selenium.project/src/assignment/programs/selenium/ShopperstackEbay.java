package assignment.programs.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperstackEbay 
{
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.shoppersstack.com/products_page/12");
	Thread.sleep(10000);
	driver.findElement(By.id("compare")).click();
	Thread.sleep(10000);
	    Set<String> allwindowids = driver.getWindowHandles();
	    
	    for(String id:allwindowids)
	    {
	   String url = driver.switchTo().window(id).getCurrentUrl();
	   
	   if(url.contains("ebay"))
	   {
		   Thread.sleep(10000);
		   driver.manage().window().maximize();
	   }
	    }
	
}
}
