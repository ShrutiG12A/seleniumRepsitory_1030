


package webelement.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submitmethod {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
	Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
     
	
	driver.findElement(By.xpath("//button[@type='submit']")).submit();
			
}
}
