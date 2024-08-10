package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreshersWorldAssignment
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.freshersworld.com/");
	
	driver.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
	driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("C:\\Users\\aadit\\eclipse-workspace\\selenium.project\\resumes\\shruti_resume.docx");
}
}
