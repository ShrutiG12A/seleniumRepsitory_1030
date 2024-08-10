package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

public class NotificationPopup 
{
public static void main(String[] args) {
// always do browse setting just before  opening the browser 
	// create chromeOptions class and inthe class we have nonn static method addArgument("chromium commands")
	// in order to get the chromium commands we need to searcch for chromium command and in thatt we need to search for notification
	// to get search bar type ctrl+f
	
	ChromeOptions option=new ChromeOptions();
//	option.addArguments("--disable-notifications");
	option.addArguments("--incognito");
//	option.addArguments("--start-maximized ");
	option.addArguments("--start-fullscreen");
	
	WebDriver driver=new ChromeDriver(option);
//	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.redbus.in/");
			
}
}