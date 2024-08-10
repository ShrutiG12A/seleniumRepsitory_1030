package webelement.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetCssValue 
{
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://demowebshop.tricentis.com/login");
	 driver.findElement(By.xpath("//input[@value='Log in']")).click();
//	String color = driver.findElement(By.xpath("//div[@class='message-error']")).getCssValue("color");
//	System.out.println(color);
  String fontsize = driver.findElement(By.xpath("//div[@class='message-error']")).getCssValue("font-size");
  System.out.println(fontsize);
}
}
