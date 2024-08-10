package webelement.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOLearnGetSize 
{
public static void main(String[] args) {
	 ChromeDriver driver=new ChromeDriver() ;
	  driver.manage().window().maximize();
	     driver.get("https://demowebshop.tricentis.com/login");
	       Dimension size = driver.findElement(By.xpath("//input[@value='Search']")).getSize();

	     System.out.println(size.getHeight()+"heigth");
       System.out.println(size.getWidth()+"width");
}	
	
	

}
