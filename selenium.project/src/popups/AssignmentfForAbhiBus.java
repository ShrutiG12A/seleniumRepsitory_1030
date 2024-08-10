package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentfForAbhiBus 
{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.abhibus.com/");


		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@style=\"padding: 0px;\"]")).click();
		while(true)
		{
			try 
			{
			driver.findElement(By.xpath("//span[text()='October']/..//span[text()='2024']/../../..//span[text()='3']")).click();
			break;
			} catch (Exception e)
			{
			driver.findElement(By.xpath("(//*[@viewBox=\"0 0 8.414 14.828\"])[1]")).click();
			}
		}
		
		
	}
}
