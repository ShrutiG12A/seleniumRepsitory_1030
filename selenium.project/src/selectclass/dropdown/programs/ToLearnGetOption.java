package selectclass.dropdown.programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnGetOption 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapp.skillrary.com/");
	
	  WebElement priceoption = driver.findElement(By.id("cars"));
	  
	  // in order to access the element of the select class create the object for the select class
	  Select optionref=new Select(priceoption);
	  
	  List<WebElement> alloptions = optionref.getOptions();
//	 System.out.println( alloptions.size());
	  // return type is list of web elemenyt  so we can access all the method of list
	  
	  System.out.println(alloptions.size());
	  for(WebElement  option:alloptions)
	  {
		  System.out.println(option.getText());
	  }
}
}
