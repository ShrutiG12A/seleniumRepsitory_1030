package assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AssignmentForSkillrarayLogin
{
@DataProvider
public String[][] dataSender()
{
	String data[][]= {{"admin","admin"},{"user","user"}};
	return data;
}

@Test(dataProvider = "dataSender")
public void login(String[] cred)
{
	WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.get("https://demoapp.skillrary.com/");
     driver.findElement(By.linkText("LOGIN")).click();
     Assert.assertEquals(driver.getTitle(),"SkillRary Courses","login page is not displayed");
     Reporter.log("login page is displayed ",true);
     driver.findElement(By.id("email")).sendKeys(cred[0]);
     driver.findElement(By.id("password")).sendKeys(cred[1]);
     
     driver.findElement(By.xpath("//button[text()='Login']")).click();
     Assert.assertEquals(driver.getTitle(),"SkillRary Ecommerce","homepage is not displayed ");
     Reporter.log("homepage  is displayed ",true);
}
}
