package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import zmq.socket.reqrep.Rep;

public class AnnotationAttributesDependsOnMethods 
{
@Test(dependsOnMethods = "register")
public void login()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demowebshop.tricentis.com/login");
	Reporter.log("user logged in successfully",true);
}

@Test
public void register()
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/register");
	Assert.fail();
	Reporter.log("user registered successfully",true);
	
}

@Test(dependsOnMethods = {"login","register"})
public void addTocart()
{
Reporter.log("product is added to cart ",true);
}
}
