package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bullet
{
@Test
public void bullet()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bikewale.com/royalenfield-bikes/");
	Reporter.log("bullet purchesed ",true );
}
}
