package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScrollByAmountAndSCrollToElemenr

{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://demoapp.skillrary.com/");
WebElement reviewicon = driver.findElement(By.xpath("//h3[text()='Review Products']"));
Actions act=new Actions(driver);
//act.scrollToElement(reviewicon).perform();
act.scrollByAmount(0, 700).perform();


}
}
