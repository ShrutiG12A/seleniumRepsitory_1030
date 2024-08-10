package assignment.programs.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeSetPositionAssignment
{
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	 Dimension size = driver.manage().window().getSize();
	 System.out.println(size.height);
	 System.out.println(size.width);
	 driver.manage().window().setPosition(new Point(50, 60));
	 
	 
	 
}
}
