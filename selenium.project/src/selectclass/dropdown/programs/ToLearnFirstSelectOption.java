package selectclass.dropdown.programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnFirstSelectOption 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demoapp.skillrary.com/");
	 WebElement priceoption = driver.findElement(By.id("cars"));
	 
	 
	
	 Select optionref=new Select(priceoption);
	 optionref.selectByIndex(0);
	 optionref.selectByValue("99");
	 optionref.selectByVisibleText("INR 100 - INR 199 ( 16 )");

      WebElement firstoption = optionref.getFirstSelectedOption();
      System.out.println(firstoption.getText());
    
	 
}
}
