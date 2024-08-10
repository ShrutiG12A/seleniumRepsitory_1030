package cars.suite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RangeRover 
{
	@Test (groups = "system")
	public  void rangeRover()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.landrover.in/range-rover/range-rover/index.html");
		Reporter.log("range rover launched successfully",true );
		}
}
