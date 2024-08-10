package takescreendshot.programs;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentWebElementScreenshot 
{
public static void main(String[] args) throws IOException
{
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	// navigating to url
	driver.get("https://demowebshop.tricentis.com/");
	
	//calling the localdatetime and  converting into string and replacing it
	 String time = LocalDateTime.now().toString().replace(":", "-");
	
	// clicking on the login link
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	
	//clicking on the login button
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	// capturing the screenshoot of web page so we need downcast into take screenshot
	TakesScreenshot ts=(TakesScreenshot) driver;
	
	// calling the getscreenshot
	 File temp = ts.getScreenshotAs(OutputType.FILE);
	 
	 // storing it in a file by giving the proper location
	 File dest=new File("./screenshots/webshoplogin"+time+".png");
	 
	 // copying the screenshot
	 FileHandler.copy(temp, dest);
	 //finding the error msg and capturing the error msg and validating the colour by capturing the color
	 WebElement errormsg = driver.findElement(By.xpath("//div[@class='message-error']"));
	 
	 System.out.println(errormsg.getText()+"= is error msg");
	 
      String color = errormsg.getCssValue("color");
      if(color.contains("rgba(255, 0, 0, 1)"))
      System.out.println("color is red");
      else
       System.out.println("any other color then red");
   // capturing the screenshot of we element   
      File temperror = driver.findElement(By.xpath("//div[@class='message-error']")).getScreenshotAs(OutputType.FILE);
      
      File desti=new File("./screenshots/errormg"+time+".png");
      FileHandler.copy(temperror, desti);
      
      
    
      
	
	
	 
	

}
}
