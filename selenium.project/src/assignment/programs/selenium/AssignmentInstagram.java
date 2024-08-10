package assignment.programs.selenium;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentInstagram 
{
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.instagram.com/");
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(2000);
	  driver.navigate().forward();
	   //driver.navigate().refresh();
}
}

