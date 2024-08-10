package synchhronization.programs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoading
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	// we are using the pageloding method of  timeouts just to check
//	whether the page is loading in a particular time or not
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
	
	driver.get("https://www.flipkart.com/");
	
}
}
