package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPOpForNovember 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	driver.get("https://www.makemytrip.com/");
	driver.findElement(By.xpath("//p[@data-cy='departureDay']")).click();
	
	String month="January";
	int year=2025;
	int date=1;
	
	for(;;)
	{
		try 
		{
		driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']")).click();
		break;
		} 
		catch (Exception e)
		{
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();	
		}
	}
}
}
