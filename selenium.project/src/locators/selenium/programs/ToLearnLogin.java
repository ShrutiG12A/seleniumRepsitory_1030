package locators.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLogin 
{
public static void main(String[] args) 
{
	
ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demowebshop.tricentis.com/login");
driver.findElement(By.name("Email")).sendKeys("ganwanishruti@gamil.com");
driver.findElement(By.name("Password")).sendKeys("shruti12");
driver.findElement(By.id("RememberMe")).click();
driver.findElement(By.className("login-button")).click();

}
}
