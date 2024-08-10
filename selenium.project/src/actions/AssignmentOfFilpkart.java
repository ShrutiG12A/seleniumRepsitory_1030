package actions;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOfFilpkart 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.flipkart.com/");
	Actions act=new Actions(driver);
	 WebElement fashionicon = driver.findElement(By.xpath("//span[text()='Fashion']"));
	act.moveToElement(fashionicon).perform();
	WebElement menbottomwear = driver.findElement(By.linkText("Men's Bottom Wear"));
	act.moveToElement(menbottomwear).perform();
	 WebElement mentrouser = driver.findElement(By.linkText("Men's Trousers"));
	 act.moveToElement(mentrouser).perform();
	 mentrouser.click();
	
}
}
