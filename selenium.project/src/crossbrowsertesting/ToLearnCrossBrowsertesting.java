package crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ToLearnCrossBrowsertesting
{
	public WebDriver driver;
	@Parameters("browser")
@Test
public void launch( @Optional("chrome") String browserName)
{
  if(browserName.equalsIgnoreCase("chrome"))
	  driver=new ChromeDriver();
  else if(browserName.equalsIgnoreCase("firefox"))
	  driver=new FirefoxDriver();
  else if(browserName.equalsIgnoreCase("safari"))
	  driver=new SafariDriver();
  else if(browserName.equalsIgnoreCase("edge"))
	  driver=new EdgeDriver();
  
  driver.get("https://demowebshop.tricentis.com/");
}
}
