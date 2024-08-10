package webelement.selenium.program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentIsDisplayed 
{
public static void main(String[] args) throws InterruptedException 
{
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://demowebshop.tricentis.com/");
Thread.sleep(7000);
 
WebElement poor = driver.findElement(By.xpath("//label[text()='Poor']"));

System.out.println(poor.isDisplayed()+"Displayed");
System.out.println(poor.isEnabled()+"  enabled ");
System.out.println(poor.isSelected()+" is selected");



 WebElement poori = driver.findElement(By.xpath("//label[text()='Poor']/..//input[@id='pollanswers-3']"));
poori.click();
System.out.println(poori.isDisplayed()+"is displayed ");
System.out.println(poori.isEnabled()+"Enabled ");
System.out.println(poori.isSelected()+"selected ");
}
}
