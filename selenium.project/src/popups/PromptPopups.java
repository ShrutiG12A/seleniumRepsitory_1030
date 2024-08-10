package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopups
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
   driver.switchTo().frame("iframeResult");
   driver.findElement(By.xpath("//button[text()='Try it']")).click();
   
 Alert alertpopups = driver.switchTo().alert();
 alertpopups.sendKeys("hello");
 
System.out.println( alertpopups.getText());
alertpopups.accept();   

}
}
