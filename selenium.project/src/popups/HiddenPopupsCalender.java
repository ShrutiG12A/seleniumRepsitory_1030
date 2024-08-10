package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopupsCalender
{
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 driver.get("https://www.makemytrip.com/");
//	 driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
//	 Thread.sleep(3000);
//	 driver.findElement(By.xpath("//div[text()='July 2024']/../..//p[text()='26']")).click();
	 
	 driver.findElement(By.xpath("//span[text()='Return']")).click();
	 driver.findElement(By.xpath("//div[text()='August']/../..//p[text()='23']")).click();
}
}
