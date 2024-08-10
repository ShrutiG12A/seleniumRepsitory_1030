  package demo.selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnNavigate 
{
public static void main(String[] args) throws InterruptedException, MalformedURLException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	// driver.get("https://www.youtube.com/watch?v=RYvOCafBqcM");
  //   driver.navigate().to("https://www.youtube.com/watch?v=RYvOCafBqcM");
	driver.navigate().to(new URL("https://www.youtube.com/watch?v=RYvOCafBqcM"));
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
}
}
