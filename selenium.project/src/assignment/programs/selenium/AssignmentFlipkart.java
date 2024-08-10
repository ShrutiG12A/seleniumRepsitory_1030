package assignment.programs.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import demo.selenium.ToLearnSetSize;

public class AssignmentFlipkart 
{
public static void main(String[] args) throws InterruptedException
{
ChromeDriver driver=new ChromeDriver();

driver.manage().window().maximize();

driver.navigate().to("https://www.flipkart.com/");
Thread.sleep(10000);
driver.manage().window().setSize(new Dimension(500, 500));
}	
	

}
