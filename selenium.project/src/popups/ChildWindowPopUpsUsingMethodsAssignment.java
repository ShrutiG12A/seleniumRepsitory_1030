package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopUpsUsingMethodsAssignment 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver() ;
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.shoppersstack.com/products_page/23");
	 String parentid = driver.getWindowHandle();
	driver.findElement(By.id("compare")).click();
	
	childWindow(driver,"amazon");
	driver.close();
	driver.switchTo().window(parentid);
	driver.close();
}
public static void childWindow(WebDriver driver,String geturl)
{
   Set<String> allwindowids = driver.getWindowHandles();
   
   for(String id:allwindowids)
   {
	  String url = driver.switchTo().window(id).getCurrentUrl();
	  if(url.contains(geturl))
		  break;
	  
   }
}
}
