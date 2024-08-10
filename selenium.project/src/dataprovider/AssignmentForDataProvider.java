package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssignmentForDataProvider 
{
@DataProvider
public String[][] dataSender()
{
	String data[][]= {{"shruti","ganwani","gan@gmail.com","shr12","shr12"},
			          {"sana","kush","sana@gmail.com","sana12","sana12"},
			          {"alex","devil","devilman@gmail.com","devi12","devi12"},
			          {"hulk","hunter","hulk@gmail.com","hulk!@","hulk!@"}};
	return data;
}
@Test(dataProvider = "dataSender")
public void register(String[] cred)
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demowebshop.tricentis.com/register");
	driver.findElement(By.id("FirstName")).sendKeys(cred[0]);
	driver.findElement(By.id("LastName")).sendKeys(cred[1]);
	driver.findElement(By.id("Email")).sendKeys(cred[2]);
	driver.findElement(By.id("Password")).sendKeys(cred[3]);
	driver.findElement(By.id("ConfirmPassword")).sendKeys(cred[4]);
}
}

