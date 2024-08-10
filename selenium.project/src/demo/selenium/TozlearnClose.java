package demo.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class TozlearnClose
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.close();
	
}
}
