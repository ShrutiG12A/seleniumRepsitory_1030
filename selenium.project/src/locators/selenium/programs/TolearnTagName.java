package locators.selenium.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolearnTagName
{
public static void main(String[] args) {
	 ChromeDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demowebshop.tricentis.com/");
	 
// since  it finds multiple element we are using find elements 
	//  and storing  them together 
	 	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
	
// printing the size it gives the total no of that element 
	 System.out.println(alllinks.size());
	
	
	// for the text field we are using input tag
	 
	List<WebElement>  alltextFields = driver.findElements(By.tagName("input"));
	 System.out.println(alltextFields.size());
	 
	 
	
}
}
