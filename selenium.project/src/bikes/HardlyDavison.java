package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardlyDavison
{
@Test
public void davison()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.harley-davidson.com/in");
	Reporter.log("davison bike purchesed ", true);
}
}
