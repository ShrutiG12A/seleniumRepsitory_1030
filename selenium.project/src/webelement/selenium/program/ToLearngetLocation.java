package webelement.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetLocation 
{
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
Point voteloc = driver.findElement(By.xpath("//input[@value='Vote']")).getLocation();
System.out.println(voteloc.getX());
System.out.println(voteloc.getY());
// Point subsloc = driver.findElement(By.xpath("//input[@value='Subscribe']")).getLocation();
//System.out.println(subsloc);

}
}
