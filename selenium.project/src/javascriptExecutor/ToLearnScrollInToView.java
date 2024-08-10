package javascriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnScrollInToView 
{
public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://demoapp.skillrary.com/");
	WebElement reviewProduct = driver.findElement(By.xpath("//h3[text()='Review Products']"));
    JavascriptExecutor js=(JavascriptExecutor) driver;
    // it will take reviewProduct as generic type 
    // that will work as input to javascript code 
    // in java script we will pass arguments[0]
    js.executeScript("arguments[0].scrollIntoView(false)",reviewProduct);
    
}}