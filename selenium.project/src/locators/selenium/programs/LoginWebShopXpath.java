package locators.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWebShopXpath 
{
public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
	
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ganwanishruti@gamil.com");
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("shruti12");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
}
}
