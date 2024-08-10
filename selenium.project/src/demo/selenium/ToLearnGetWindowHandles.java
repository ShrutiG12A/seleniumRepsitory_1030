

package demo.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToLearnGetWindowHandles 
{
public static void main(String[] args) throws InterruptedException 
{
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.shoppersstack.com/products_page/6");
Thread.sleep(20000);
driver.findElement(By.id("compare")).click();
  Set<String> allwindowids = driver.getWindowHandles();
  
  System.out.println(allwindowids);// directly printing 
  
  
 System.out.println("printing using for each loop");
  for(String id:allwindowids)
  {
	  System.out.println(id);
  }


}
}
