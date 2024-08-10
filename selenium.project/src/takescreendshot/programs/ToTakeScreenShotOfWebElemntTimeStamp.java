package takescreendshot.programs;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakeScreenShotOfWebElemntTimeStamp
{
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
  String time = LocalDateTime.now().toString().replace(":", "-");
  driver.get("https://demowebshop.tricentis.com/");
  Thread.sleep(3000);
   File temp = driver.findElement(By.xpath("//img[@class='nivo-main-image']")).getScreenshotAs(OutputType.FILE);
    
   File dest=new File("./screenshots/webshopelement"+time+".png");
   FileHandler.copy(temp, dest);


}
}
