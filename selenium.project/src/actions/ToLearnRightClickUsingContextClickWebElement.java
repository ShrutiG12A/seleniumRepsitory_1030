package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnRightClickUsingContextClickWebElement
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
	Actions act=new Actions(driver);
	
	WebElement rightclickele = driver.findElement(By.xpath("//button[text()='Right Click']"));
	act.contextClick(rightclickele).perform();
	driver.findElement(By.xpath("//div[text()='Yes']")).click();
	
}
}
