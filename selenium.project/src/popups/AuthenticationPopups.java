package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopups 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	// in order to avoid these popup we need to pass the data in following syntax in these 
	// url only-username:password@
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
}
}
