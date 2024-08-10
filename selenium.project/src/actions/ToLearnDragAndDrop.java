package actions;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDrop
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(frame1);
	
	WebElement image12 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
      WebElement trash = driver.findElement(By.id("trash"));
      Actions act=new Actions(driver);
      //DRAGGING THE IMAGE AND PERFORMING THE DROP ACTION 
      act.dragAndDrop(image12, trash).perform();
      
   WebElement image13 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
     act.dragAndDrop(image13, trash).perform();
     
     
    // dragging from trash and dropping inthe gallary 
     Thread.sleep(2000);
     WebElement gallary = driver.findElement(By.id("gallery"));
  act.dragAndDrop(image12, gallary).perform();
     

}
}
