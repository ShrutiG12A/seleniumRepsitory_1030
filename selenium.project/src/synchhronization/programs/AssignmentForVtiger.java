package synchhronization.programs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentForVtiger 
{
public static void main(String[] args) throws InterruptedException, IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
// implicitly we are giving the wait i.e.intelligent wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	// using loacal date time  to get current date time 
	String time = LocalDateTime.now().toString().replace(":", "-");
			
			
			

	// navigating to  webpage 
	driver.get("https://demo.vtiger.com/vtigercrm/");
	String parentId = driver.getWindowHandle();
	// 1.finding the element to move to next page 
	//. calling getwindowhandles  capturing the window ids 
	//using switchto method so that after  moving to other tab we can 
//	perform any of action or else we will get noSuchElement Exception even though we moved to next page but we cannot perform any action bcz ctrl is in first page 
	   driver.findElement(By.linkText("Vtiger")).click();
	     Set<String> windowid = driver.getWindowHandles();
	     
	     for(String id:windowid)
	     {
	    String url = driver.switchTo().window(id).getCurrentUrl();
	    if(url.contains("www.vtiger.com"))
	    	break;
	     }
       driver.findElement(By.id("loginspan")).click();
       driver.findElement(By.name("username")).sendKeys("shruti@gmail.com");
       driver.findElement(By.name("password")).sendKeys("shruti1234");
       driver.findElement(By.xpath("//button[text()='Sign in']")).click();
       
       WebElement errormsg = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));
       
       System.out.println(errormsg.getText());
      System.out.println(errormsg.getCssValue("color"));
      
     
      TakesScreenshot ts=(TakesScreenshot) driver;
      File temp = ts.getScreenshotAs(OutputType.FILE);
      File dest=new File("./screenshots/vtiger"+time+".png");
      FileHandler.copy(temp, dest);
      

//    for( String id:windowid)
//    {
//    	String url = driver.switchTo().window(id).getCurrentUrl();
//    	if(url.contains("demo.vtiger.com/vtigercrm"))
//    		break;
//    }
      driver.switchTo().window(parentId);
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.xpath("//button[text()='Sign in']")).click();
    
    TakesScreenshot ts1=(TakesScreenshot) driver;
   File temp1 = ts1.getScreenshotAs(OutputType.FILE);
      File dest1=new File("./screenshots/vtigerlogin"+time+".png");
      FileHandler.copy(temp1, dest1);
      
      
         
     
}}	