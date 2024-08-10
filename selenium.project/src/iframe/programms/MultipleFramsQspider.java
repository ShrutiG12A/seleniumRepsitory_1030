package iframe.programms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFramsQspider 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
	 WebElement firstiframe = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
	 driver.switchTo().frame(firstiframe);
	 
	 driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
	 
	 driver.switchTo().parentFrame();
	WebElement secondiframe = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
	driver.switchTo().frame(secondiframe);
	driver.findElement(By.id("username")).sendKeys("username");
	 
}
}
