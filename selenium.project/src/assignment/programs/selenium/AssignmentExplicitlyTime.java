package assignment.programs.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import synchhronization.programs.ToLearnExplicitlyWait;

public class AssignmentExplicitlyTime 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://demowebshop.tricentis.com/");
	// we are finding the elements on which we want ton perform any of a operation
	driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']")).click();
//	Thread.sleep(2000);
	// the element on which we want to perform any of a operation or an elemnt with the condition  we are storing that element 
	WebElement link = driver.findElement(By.xpath("//a[text()='Log in']"));
	// we are creating the webdriver wait object
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	// we are calling the until method and in that we calling the method of expected condition class  and that method conditional element refrence variable 
	// and then we are performing the click action
	wait.until(ExpectedConditions.visibilityOf(link));
	link.click();
}
}
