

package takescreendshot.programs;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotOfWebPageTimeStamp 
{
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	// 2 step  process
//	   LocalDateTime systemtime = LocalDateTime.now();
	   // we will call to string method  to convert into string formate and replace it 
	   
//	   String time = systemtime.toString().replace(":", "-");
	   
	   // 1step process
	   
	 String time = LocalDateTime.now().toString().replace(":","-");
	driver.get("https://demowebshop.tricentis.com/");

	TakesScreenshot ts=(TakesScreenshot) driver;
	
            File temp = ts.getScreenshotAs(OutputType.FILE);
            
            File dest=new File("./screenshots/webshop"+time+".png");
            FileHandler.copy(temp, dest);
}
}
