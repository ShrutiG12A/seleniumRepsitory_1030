package demo.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class ToLearnGetPosition
{
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	
	//driver.manage().window().setSize(new Dimension(900,300));
    Point position = driver.manage().window().getPosition();
   System.out.println(position.getX());
   System.out.println(position.getY());
    
    
    
}
}
