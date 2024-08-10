package locators.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnRegister

{
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/register");
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("shruti");
	driver.findElement(By.id("LastName")).sendKeys("ganwani");
	driver.findElement(By.id("Email")).sendKeys("ganwanishruti@gamil.com");
	driver.findElement(By.id("Password")).sendKeys("shruti12");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("shruti12");
	driver.findElement(By.id("register-button")).click();
}
}
