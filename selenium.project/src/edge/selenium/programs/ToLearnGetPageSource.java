package edge.selenium.programs;

import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetPageSource
{
public static void main(String[] args) throws InterruptedException 
{
	// create the object
EdgeDriver driver=new EdgeDriver();

//  navigate to the source page

driver.get("https://demoapps.qspiders.com/");

  String source = driver.getPageSource();
  System.out.println(source);// to get the source page 
  
  Thread.sleep(2000);
  driver .close();



}
}
