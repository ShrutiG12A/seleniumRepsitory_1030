package demo.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSetSize
{


public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoapps.qspiders.com/");
	 
	driver.manage().window().setSize( new Dimension(500,500));
}
}
