
package selectclass.dropdown.programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnDeselectOptions 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapp.skillrary.com/");
	  WebElement priceoption = driver.findElement(By.id("cars"));
	 
	  
	  Select  optionref=new Select(priceoption);
	  optionref.selectByIndex(0);
	  optionref.selectByValue("99");
//	  if ur using select by visible text then remove the extra space 
	  optionref.selectByVisibleText("INR 100 - INR 199 ( 16 )");
	  
	  Thread.sleep(2000);
	  optionref.deselectByIndex(0);
	  optionref.deselectByValue("99");
	  optionref.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
//      optionref.deselectAll();  
	  
	  
	  
	
}
}
