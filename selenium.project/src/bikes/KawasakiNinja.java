package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KawasakiNinja 
{
@Test
public void ninja()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://kawasaki-india.com/");
	Reporter.log("kawasaki ninja bikes purchased",true );
}
}
