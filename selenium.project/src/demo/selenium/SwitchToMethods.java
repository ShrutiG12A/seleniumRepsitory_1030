package demo.selenium;
// this is how we complete the task in the company
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethods 
{
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();// creating an object
	driver.get("https://demowebshop.tricentis.com/");// navigating to url
	  String parentid = driver.getWindowHandle();// storing the parent window id 
	  
	  driver.findElement(By.linkText("Facebook")).click();// navigating to facebook tab
	  switchToWindow(driver,"Facebook");// calling a method  
	  // we passing two actual arguments driver objectrefrence and "facebook" element
	 
	 String title=driver.getTitle();// printing the title for face book
	 System.out.println(title);
	driver.switchTo().window(parentid);// now we switch it to the parent id by passig the parent id by passing parent id  into windows
	Thread.sleep(2000);
	driver.close();
	
}
public static void switchToWindow(WebDriver driver,String url)// string url is of facebook
{
            Set<String> allwindowids = driver.getWindowHandles();// clling a method to store all window ids 
            for(String id:allwindowids)// paasing it in a for loop
            {
            	String acturl = driver.switchTo().window(id).getCurrentUrl();//calling a method to to witch the window and caputre the url
            	if(acturl.contains(url))
            		break;// acturl matching with facebook(url) the break it  means control will transfer from for loop to called method 
            	
 
           }
}
}
