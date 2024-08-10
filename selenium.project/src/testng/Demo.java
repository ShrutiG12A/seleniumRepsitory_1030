package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo//testNG class
{
@Test
public void sample()//test case
{//test steps
	Reporter.log("welcome to advance selenium",true);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.shoppersstack.com/");
}

@Test
public void sample1()
{
Reporter.log("demo test case is executing ",true );
WebDriver driver=new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");
}
}
