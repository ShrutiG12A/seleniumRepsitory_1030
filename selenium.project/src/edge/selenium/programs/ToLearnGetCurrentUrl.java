package edge.selenium.programs;

import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class ToLearnGetCurrentUrl
{
public static void main(String[] args) {
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in/");
	
	  String url = driver.getCurrentUrl();
	  System.out.println("the url of the apllication is "+ url);
	  if(url.equals("https://www.amazon.in/"))
		  System.out.println("user navigated succeessfully");
	  else
		  System.out.println("user failed navigate");
}
}
