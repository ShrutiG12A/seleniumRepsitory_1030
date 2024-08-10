package takescreendshot.programs;




import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import graphql.language.ObjectTypeDefinition;
public class ScreenshotOfWebPage 
{
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	// downcasting into the takescreenshot
	TakesScreenshot ts=(TakesScreenshot) driver;
	
   File temp = ts.getScreenshotAs(OutputType.FILE);
   
//  System.out.println(temp);
   File dest=new  File("./screenshots/image.png");
    FileHandler.copy(temp, dest);
   
	
}
}
