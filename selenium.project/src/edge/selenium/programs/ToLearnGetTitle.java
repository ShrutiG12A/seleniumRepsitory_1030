package edge.selenium.programs;

import org.openqa.selenium.edge.EdgeDriver;

import graphql.relay.Edge;
import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class ToLearnGetTitle
{
public static void main(String[] args) {
	EdgeDriver driver =new EdgeDriver();// creating the object 
	driver.get("https://www.amazon.in/");// navigating to the url
	
	String title = driver.getTitle();// getting the title for the  particular url
	System.out.println(title);
	
	if(title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
		System.out.println("user navigated successfully");
	else
		System.out.println("user failed to navigate");
			
	
}
}
