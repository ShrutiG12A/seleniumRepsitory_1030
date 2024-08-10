package locators.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByText
{
public static void main(String[] args) {
	 ChromeDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://demowebshop.tricentis.com/login");
	 
// we are using xpath by  text  find the elements
	 
	 driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	 
	 
}
}
