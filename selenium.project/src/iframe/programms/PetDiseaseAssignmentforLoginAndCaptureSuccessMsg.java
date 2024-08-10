package iframe.programms;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PetDiseaseAssignmentforLoginAndCaptureSuccessMsg
{
public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.get("https://petdiseasealerts.org/forecast-map/#/");
	WebElement iframe1 = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
	 driver.switchTo().frame(iframe1);
	 
	 
	 driver.findElement(By.id("region-27")).click();
	 
 driver.switchTo().parentFrame();
	driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	
	driver.findElement(By.id("user")).sendKeys("ganwanish@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("shruti@12");
	driver.findElement(By.id("cpass")).sendKeys("shruti@12");
	driver.findElement(By.id("firstName")).sendKeys("shruti");
	driver.findElement(By.id("lastName")).sendKeys("ganwani");
	driver.findElement( By.id("phone")).sendKeys("8827661322");
	
	
	
	  WebElement usertype = driver.findElement(By.id("user-type"));
	  Select typeref=new Select(usertype);
typeref.selectByVisibleText("Pet Owner");
	  
	  driver.findElement(By.xpath("//label[text()='I have read and agree to the ']/..//input[@id='accept-tou']")).click();
	  driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	  
	 String successmsg = driver.findElement(By.xpath("//b[text()='Thank you for registering!']")).getText();
	  System.out.println(successmsg);
	  

	 
}
}
