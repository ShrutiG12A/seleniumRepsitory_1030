package assignment.programs.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dream11Test 
{
public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.get("https://www.dream11.com/");
//	 driver.switchTo().frame(0);
//	 driver.switchTo().frame("send-sms-iframe");
	 
	WebElement frameid = driver.findElement( By.xpath("//iframe[@title='Iframe Example']"));
	driver.switchTo().frame(frameid);
	 WebElement email = driver.findElement(By.id("regEmail"));
	 email.sendKeys("789628278");
 
	WebElement clickbutton = driver.findElement(By.id ("regUser"));
	clickbutton.click();
	String errormsg = driver.findElement(By.xpath("//label[contains(text(),'Please enter a valid ')]")).getText();
	 System.out.println(errormsg);
}
}
