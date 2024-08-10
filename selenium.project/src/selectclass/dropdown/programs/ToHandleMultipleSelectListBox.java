package selectclass.dropdown.programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToHandleMultipleSelectListBox 
{
public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	 driver.get("https://demoapp.skillrary.com/");  
	WebElement pricelist = driver.findElement(By.id("cars"));
	
	Select  pricelistref=new Select(pricelist);
	pricelistref.selectByIndex(1);
//	pricelistref.selectByValue("199");
//	remove the extra space present in the  last or else it will not select that option 
	pricelistref.selectByVisibleText("INR 200 - INR 299 ( 3 )");
        System.out.println( pricelistref.isMultiple());
	
	 
	 
}
}
