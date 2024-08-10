package locators.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute
{
public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver() ;
	
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	
//driver.findElement(By.xpath("//input[@value='Search']")).click();
	
	driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
}
}
