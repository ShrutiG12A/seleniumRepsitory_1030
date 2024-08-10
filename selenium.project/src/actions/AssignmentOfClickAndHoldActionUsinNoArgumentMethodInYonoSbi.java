package actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOfClickAndHoldActionUsinNoArgumentMethodInYonoSbi 
{
public static void main(String[] args) throws IOException
{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 String time = LocalDateTime.now().toString().replace(":", "-");

driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
WebElement passwords = driver.findElement(By.id("password"));
passwords.sendKeys("shruti@Movie12");

Actions act=new Actions(driver);
act.moveByOffset(1292,320 ).clickAndHold().perform();

File temp = passwords.getScreenshotAs(OutputType.FILE);

File dest=new File("./screenshots/passwordyono"+time+".png");
org.openqa.selenium.io.FileHandler.copy(temp, dest);





}
}
