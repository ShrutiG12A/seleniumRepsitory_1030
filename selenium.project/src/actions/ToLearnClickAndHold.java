package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickAndHold
{
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
	 driver.findElement(By.id("password")).sendKeys("Action@11223");
	 
	 Actions act=new Actions(driver);
	 
	WebElement eyeicon = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
	
	act.clickAndHold(eyeicon).perform();
	Thread.sleep(2000);
	driver.findElement(By.id("login")).click();
String captchaerror = driver.findElement(By.xpath("//span[contains(text(),'Please enter the text as shown in the image.')]")).getText();
System.out.println(captchaerror);
driver.close();
}
}
