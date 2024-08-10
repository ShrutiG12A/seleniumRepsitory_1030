package iframe.programms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11ExampleForTHREELines 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.dream11.com/");
//	 String parentid = driver.getWindowHandle();
	driver.switchTo().frame("send-sms-iframe");
	driver.findElement(By.id("regEmail")).sendKeys("8827661355");
//    driver.switchTo().window(parentid);
//	
//	 by usimg methods of switchto .to switch back to parent id
	driver.switchTo().parentFrame();
//	driver.switchTo().defaultContent();
     driver.findElement(By.id("hamburger")).click();	
}
}
