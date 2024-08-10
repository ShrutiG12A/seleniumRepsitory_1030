package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver() ;
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.shoppersstack.com/products_page/18");
	  String parentid = driver.getWindowHandle();
	 driver.findElement(By.id("compare")).click();
	 
	    Set<String> allwindowids = driver.getWindowHandles();
	    for(String id:allwindowids)
	    {
	    String url = driver.switchTo().window(id).getCurrentUrl();
	   if(url.contains("flipkart"))
		   break;
	    }
	    driver.close();
	    driver.switchTo().window(parentid);
	    driver.close();
}
}
