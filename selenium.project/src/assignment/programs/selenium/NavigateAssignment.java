package assignment.programs.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateAssignment
{
public static void main(String[] args) {
	// FirefoxDriver driver=new FirefoxDriver();
	ChromeDriver driver=new ChromeDriver();
	 driver.get("https://www.yatra.com/");
}
}
