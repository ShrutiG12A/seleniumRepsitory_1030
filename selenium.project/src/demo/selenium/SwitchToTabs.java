package demo.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToTabs 
{
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	
	
	
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Facebook")).click();
	 String parentid = driver.getWindowHandle();
	
      Set<String> allwindowids = driver.getWindowHandles();
      
      for(String id:allwindowids)
      {
    	  String url = driver.switchTo().window(id).getCurrentUrl();
    	  if(url.contains("facebook"))
    		  break;
      }
      String title = driver.getTitle();
      System.out.println(title);
      driver.close();
      
      /// navigating to main window id 
      
      //1/ caputre the window id after navigating to url
      //2// pass that id after for each loop
      
      driver.switchTo().window(parentid);
      Thread.sleep(2000);
      driver.close();
      
      
      
}
}
