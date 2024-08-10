package assignment.programs.selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class Assignment1
{
public static void main(String[] args) throws MalformedURLException, InterruptedException 
{
ChromeDriver driver=new ChromeDriver();// CREATING THE Object
driver.manage().window().maximize();// maximise the window

driver.navigate().to(new URL("https://www.amazon.in/"));
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().refresh();

driver.manage().window().setPosition(new Point(50,50));
Thread.sleep(2000);
driver.manage().window().setSize(new Dimension(750, 750));
 

     String title = driver.getTitle();
     System.out.println(title);


}
}
