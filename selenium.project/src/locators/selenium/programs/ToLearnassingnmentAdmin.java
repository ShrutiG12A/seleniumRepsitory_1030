package locators.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnassingnmentAdmin// assignmet of login after
{
	
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("LOGIN")).click();
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin");
	driver.findElement(By.id("last")).click();
	
	      String title = driver.getTitle();
	      System.out.println(title );
	      if(title.equals("SkillRary Ecommerce"))
	      {
	    	System.out.println("user navigated successfully");  
	      }
	      else
	      {
	    	  System.out.println("user failed to navigate");
	      }
}
}
