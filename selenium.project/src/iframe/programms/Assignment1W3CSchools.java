package iframe.programms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1W3CSchools 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");

	// switching the driver control from one frame to other frame just switch from main window to frame 
	// inthese we will check if that particular element is developed using the iframe tag 
	// we have three types of iframe types--single,multiple,nested iframe
	//we can use frame in three ways 
	//frame(int index),frame(String name,id), frame(WebElement FrameElemnet)
	
	
	//steps to identify which frame type we will be using inthe code 
	//1.. if developed using id or you can first use xpath  using find element and store it and pass reference variable inthe frame //2..then find the element inthat frame using 
	
	
	
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
}
}
