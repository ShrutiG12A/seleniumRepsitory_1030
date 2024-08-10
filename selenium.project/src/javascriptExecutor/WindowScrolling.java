package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowScrolling
{
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver() ;
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://demowebshop.tricentis.com/");
	 
	 
	 //  we need to typecast in order to perform an action on the javascript executor and its methods 
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 // select the abstract method of the javascript executor
	 // other one is depricated method means they will remove the method in the future 
	 
	 
	 js.executeScript("window.scrollBy(0,700)");
	 
	 Thread.sleep(2000);
	 // scrollTo method always starts from very first point of the axis where scrolling starts 
	 js.executeScript("window.scrollTo(0,700)");
}
}
