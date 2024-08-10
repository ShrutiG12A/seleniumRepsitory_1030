package webelement.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsSelected 
{
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	WebElement option = driver.findElement(By.xpath("//option[text()='INR 200 - INR 299 ( 3 ) ']"));
      System.out.println(option.isSelected());
      option.click();
      System.out.println("after clicking");
      System.out.println(option.isSelected());


}
}
