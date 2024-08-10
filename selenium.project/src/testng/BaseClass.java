package testng;

import java.time.Duration;

import org.checkerframework.checker.initialization.qual.FBCBottom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
//	since we are making the multiple methods soo we need declare the webdriver as local variable 
//	 then we can acess the wedriver object in a ll the methods 
public WebDriver driver;
@BeforeClass
public void openBrowser()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://demowebshop.tricentis.com/");
}
@BeforeMethod()
public void login()
{
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("ganwanishruti@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("shruti!");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
}
@AfterMethod
public void logout()
{
	driver.findElement(By.linkText("Log out")).click();
}
@AfterClass
public void closeBrowser()
{
	driver.quit();
}
}
