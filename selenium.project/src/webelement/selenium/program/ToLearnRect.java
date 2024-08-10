package webelement.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnRect 
{
public static void main(String[] args) {
	 ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/");
	
//	Rectangle searchrect = driver.findElement(By.id("small-searchterms")).getRect();
//System.out.println("height "+searchrect.getHeight());
//System.out.println("width "+searchrect.getWidth());
//System.out.println("x path "+searchrect.getX());
//System.out.println("y path "+searchrect.getY());
	 
	 
 Rectangle emailrect = driver.findElement(By.id("newsletter-email")).getRect();
System.out.println("heigth "+emailrect.getHeight());
System.out.println("width "+emailrect.getWidth());
System.out.println("x path"+emailrect.getX());
System.out.println("y path"+emailrect.getY());


}
}
