package cars.suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RollsRoyace 
{
@Test (groups = "integration")
public void rollsRoyace()
{
	WebDriver driver=new ChromeDriver();
	driver.get(" https://www.rolls-roycemotorcars.com/");
      Reporter.log("rollsroyace launched successfully",true );
      
}
}
