package javascriptExecutor;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentForOracleDocument
{
public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.oracle.com/in/java/technologies/downloads/");
	 driver.findElement(By.xpath("//a[@id=\"java8-doc-download\"]")).click();
	  
	 isSwitch(driver,"in/java/technologies/javase-jdk8");
	 driver.findElement(By.linkText("javafx-8u411-apidocs.zip")).click();


WebElement checkbox = driver.findElement(By.xpath("//label[@class='hasOreq']/..//input[@type='checkbox']"));
    JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("arguments[0].click()",checkbox);
 WebElement download8 = driver.findElement(By.linkText("Download javafx-8u411-apidocs.zip"));
  js.executeScript("arguments[0].click()",download8 );
  driver.findElement(By.xpath("//button[@aria-label='close modal']")).click();
  driver.findElement(By.linkText("Java SE Development Kit 8 Documentation License Agreement")).click();
  isSwitch(driver,"downloads/licenses/javase8speclicense");
  
   List<WebElement> alltags = driver.findElements(By.tagName("strong"));
   for(WebElement i:alltags)
   {
	   System.out.println(i.getText());
   }
}
public static void isSwitch(WebDriver driver,String geturl)
{
	Set<String> allwindowid = driver.getWindowHandles();
	for(String id:allwindowid)
	{
		 String url = driver.switchTo().window(id).getCurrentUrl();	
		 if(url.contains(geturl))
		 break;
	}
}
}
