package demo.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetAttributs
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");
	String searchelement = driver.findElement(By.name("q")).getAttribute("title");
	System.out.println(searchelement);
	
	if(searchelement.contains("Search for Products"))
	{
		System.out.println("tool tip is present");
	}
	else
	{
		System.out.println("tool tip is not present ");
	}
}
}
