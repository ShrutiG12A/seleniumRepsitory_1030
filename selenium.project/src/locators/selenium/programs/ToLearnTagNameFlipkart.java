package locators.selenium.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTagNameFlipkart 
{
public static void main(String[] args) {
	ChromeDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	List<WebElement> allbutton=driver.findElements(By.tagName("button"));
	
	  List<WebElement> alltextfield = driver.findElements(By.tagName("input"));
	System.out.println(allbutton.size()+"buttons ");
	System.out.println(allbutton);
	System.out.println(alltextfield.size()+"all the text fields ");
	
	
}
}
