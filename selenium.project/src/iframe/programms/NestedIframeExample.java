package iframe.programms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframeExample 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1&scenario=4");
	
	WebElement parentiframe = driver.findElement(By.xpath("//iframe[contains(@class,'w-full')]"));
	
	driver.switchTo().frame(parentiframe);
	//in nested i frame we have iframe embedded inside an iframe so we  will first switch to parent iframe and then child iframe 
	// after parent iframe again  for the child frame  index will start from 0
	
	driver.switchTo().frame(0);
	driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Admin@1234");
	driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
	driver.findElement(By.id("submitButton")).click();
}
}
