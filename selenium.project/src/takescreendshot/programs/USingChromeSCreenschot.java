package takescreendshot.programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class USingChromeSCreenschot 
{
public static void main(String[] args) throws IOException, InterruptedException {
	// here we are using the chrome driver directly
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	// we are calling the get method 
	driver.get("https://www.shoppersstack.com/");
	Thread.sleep(2000);
	
	// calling the get screenshot method and  storing it  in a variable 
      File shopperss = driver.getScreenshotAs(OutputType.FILE);
      
      // we are creating the file and giving the location to access we are using the dot in location
      File dest=new File("./screenshots/shopper.png");
      // we callin the  copy method
      // copy method is static method soo we are calling using the class name 
      // this will throw checked exception i.e. input output exception//ioexception we just need to declare it
      FileHandler.copy(shopperss, dest);
}
}
