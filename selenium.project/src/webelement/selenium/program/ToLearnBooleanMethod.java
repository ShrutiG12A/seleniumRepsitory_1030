package webelement.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethod 
{
public static void main(String[] args) throws InterruptedException {
	 ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	/* driver.get("https://www.instagram.com/");
	 Thread.sleep(3000);	
	 WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
	 System.out.println("---brfore sending the data--");
	System.out.println(loginbutton.isDisplayed());
	System.out.println(loginbutton.isEnabled());
	
	driver.findElement(By.name("username")).sendKeys("emailaddress");
	driver.findElement(By.name("password")).sendKeys("passwords ");
      
	System.out.println("--after sending the data--");
	System.out.println(loginbutton.isDisplayed());
	System.out.println(loginbutton.isEnabled());
	
	loginbutton.click(); */
	 
	 driver.get("https://demoapp.skillrary.com/");
	 WebElement checkbox = driver.findElement(By.xpath("//input[@class='form-control']"));
	System.out.println(checkbox.isDisplayed());
	System.out.println(checkbox.isEnabled());
}
}
