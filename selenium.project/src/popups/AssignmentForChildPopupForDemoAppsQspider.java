package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentForChildPopupForDemoAppsQspider 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2");
	String parentid = driver.getWindowHandle();
	
	driver.findElement(By.id("browserButton3")).click();
	
	multipleWindows(driver,"SignUpPage");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("password")).sendKeys("admin");
	driver.findElement(By.id("confirm-password")).sendKeys("admin");
	driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	  driver.close();
	multipleWindows(driver, "browser/Login");
	driver.close();
	driver.switchTo().window(parentid);
	driver.close();
}
public static void multipleWindows(WebDriver driver,String geturl)
{
Set<String> allwindowids = driver.getWindowHandles();

for(String id:allwindowids)
{
String url = driver.switchTo().window(id).getCurrentUrl();
if(url.contains(geturl))
	break;
	
}
}
}
