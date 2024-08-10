package locators.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLinkText 
{
	public static void main(String[] args) throws InterruptedException
	{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
     driver.findElement(By.linkText("Register")).click();
     driver.navigate().back();
     Thread.sleep(10000);
	//driver.findElement(By.linkText("Books")).click();
	driver.findElement(By.linkText("Sitemap")).click();
	}
}

