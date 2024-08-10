package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Aprillia {
@Test
public void aprillia()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://shop.apriliaindia.com/model");
	
	Reporter.log("aprillia bike purchased ",true );
}}
