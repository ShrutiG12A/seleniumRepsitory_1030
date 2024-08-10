package locators.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnId 
{
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/login");
	//driver.findElement(By.id("Email")).sendKeys("ganwanishruti@gamil.com");
driver.findElement(By.id("Password")).sendKeys("Abc.@!");
}
}
