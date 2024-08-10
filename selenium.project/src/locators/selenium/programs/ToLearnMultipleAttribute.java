package locators.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnMultipleAttribute 
{
public static void main(String[] args) throws InterruptedException 
{
ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();

//driver.get("https://demowebshop.tricentis.com/register");
//driver.findElement(By.xpath("//input[@data-val-required='` required.'and @type='text']")).sendKeys("ganwani");
//learn using depenent and independent 
//driver.get("https://www.shoppersstack.com/");
//Thread.sleep(30000);
//driver.findElement(By.xpath("//span[text()=' PONDS']/../..//button[text()='add to cart']")).click();

driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(10000);
//driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']")).click();
driver.findElement(By.xpath("//label[text()='Good']/..//input[@id='pollanswers-2']")).click();
}
}
