package synchhronization.programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnExplicitlyWait
{
public static void main(String[] args) 
{// pre conditionCheck
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.shoppersstack.com/products_page/23");
	
	driver.findElement(By.id("Check Delivery")).sendKeys("560010");
  
     // finding the element and storing the element 
	 WebElement checkButton = driver.findElement(By.id("Check"));
	 
	 //explicit we are using  only on based on the conditiong 
	 // we will create the explicit wait object it will take object reference of driver and duration i.e.is class
	 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

//	  using object reference we will call the  until method
	 // in until method whatever the condition we have we are using that condidti
	 

	 wait.until(ExpectedConditions.elementToBeClickable(checkButton));
	 checkButton.click();
	 
	 
	
}
}
