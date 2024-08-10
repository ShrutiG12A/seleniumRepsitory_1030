

package webelement.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ToLearnGetAttribute 

{
public static void main(String[] args) {
	 ChromeDriver driver =new ChromeDriver() ;
	 driver.manage().window().maximize();
	 
//	 driver.get("https://demowebshop.tricentis.com/");
//	 String valueatt = driver.findElement(By.id("small-searchterms")).getAttribute("value");
	 
//	System.out.println(valueatt);
	 driver.get("https://www.flipkart.com/");
	String title = driver.findElement(By.xpath("//button[contains(@aria-label,'Search for Products, Brands')]")).getAttribute("title");
	System.out.println(title);
}
}
