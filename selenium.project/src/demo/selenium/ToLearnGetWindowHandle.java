package demo.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandle
{
public static void main(String[] args)
{
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.flipkart.com/");
 String windowid = driver.getWindowHandle();
 System.out.println("window id is "+ windowid);
 driver.close();
}
}
