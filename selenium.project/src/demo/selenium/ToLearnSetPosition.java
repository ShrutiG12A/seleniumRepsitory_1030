package demo.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSetPosition
{
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().window().setSize(new Dimension(1000 ,300));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.manage().window().setPosition(new Point(100,-50));
}
}
