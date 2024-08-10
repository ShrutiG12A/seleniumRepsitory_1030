package demo.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class ToLearnGetSize 
{
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	
	driver.get("https://demoapps.qspiders.com/");
	      Dimension size = driver.manage().window().getSize();
	      System.out.println(size.getHeight());
	      System.out.println(size.getWidth());
	
	
}
}
