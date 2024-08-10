package webelement.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagName 
{
public static void main(String[] args) {
	 ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://demowebshop.tricentis.com/login");
	  String tagname = driver.findElement(By.id("small-searchterms")).getTagName();
	  System.out.println(tagname);
}	
}




