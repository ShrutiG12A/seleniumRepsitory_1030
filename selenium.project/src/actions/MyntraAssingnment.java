package actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraAssingnment 
{
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 String time = LocalDateTime.now().toString().replace(":", "-");
	
	driver.get("https://www.myntra.com/");
WebElement men = driver.findElement(By.xpath("(//a[@href='/shop/men'])[1]"));

Actions act=new Actions(driver);
act.moveToElement(men).perform();

																			

TakesScreenshot ts=(TakesScreenshot) driver;
File temp = ts.getScreenshotAs(OutputType.FILE);
File dest=new File("./screenshots/menswear"+time+".png");
org.openqa.selenium.io.FileHandler.copy(temp, dest);
}
}
