package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformActionOnTheHiddenElements
{
public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.get("https://www.facebook.com/signup");
	 
	WebElement customgender = driver.findElement(By.name("custom_gender"));
	
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	// value is attribute belongs to html we are using the combination of javascript and html 
	// we can perform action without using sendkeys 
	js.executeScript("arguments[0].value='hi their'", customgender);
	
	
	driver.findElement(By.xpath("//label[text()='Custom']/..//input[@type='radio']")).click();
}
}
