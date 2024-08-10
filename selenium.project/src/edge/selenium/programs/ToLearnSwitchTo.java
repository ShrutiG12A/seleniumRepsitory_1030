package edge.selenium.programs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo 
{
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.shoppersstack.com/products_page/8");
	Thread.sleep(20000);
	driver.findElement(By.id("compare")).click();
	
	  Set<String> allwindowids = driver.getWindowHandles();
	  for(String id:allwindowids)
	  {
		  String url = driver.switchTo().window(id).getCurrentUrl();
		  if(url.contains("Flipkart"))
		  {
			Thread.sleep(2000); 
			driver.close();
		  }
	  }
}
}
