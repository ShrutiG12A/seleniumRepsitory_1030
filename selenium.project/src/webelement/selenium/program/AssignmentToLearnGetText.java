package webelement.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentToLearnGetText 
{
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	
/*	driver.get("https://demo.vtiger.com/vtigercrm/");
	//  1. first we are clearning the text field
	//  2.  passing the data into the text fields 
	//  3.getting the error msg 
	Thread.sleep(2000);
	WebElement usernametf = driver.findElement(By.id("username"));
          usernametf.clear();
          
     WebElement passwordtf = driver.findElement(By.id("password"));
     passwordtf.clear();
     
     usernametf.sendKeys("USERNAME");
    passwordtf.sendKeys("ADMIN");
    
    driver.findElement(By.xpath("//button[@type='submit' and text()='Sign in']")).click();
      String errormsg = driver.findElement(By.id("validationMessage")).getText();
      System.out.println(errormsg);
      
      if(errormsg.contains("Invalid "))
    	  System.out.println("error msg displayed ");
      else
    	  System.out.println(" not displayed ");*/
	
	
	// now somthing extra done by me 
	
	driver.get("https://www.flipkart.com/");
	
	
	driver.findElement(By.xpath("//div[text()='Oppo F27 Pro plus']")).click();
	
	
	driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
    
	
	
	
}
}
