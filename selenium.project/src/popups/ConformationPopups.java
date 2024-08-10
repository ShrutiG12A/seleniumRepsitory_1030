package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConformationPopups
{
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	 // element is in iframe so we need switch to iframe
driver.switchTo().frame("iframeResult");
driver.findElement(By.xpath("//button[text()='Try it']")).click();
//to handle the popups we switch it to alert and store it to perform actions 
     Alert popups = driver.switchTo().alert();
     System.out.println(popups.getText());
//       popups.accept();
       popups.dismiss();
// 


}
}
