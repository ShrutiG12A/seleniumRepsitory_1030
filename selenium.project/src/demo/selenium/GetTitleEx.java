package demo.selenium;

import org.openqa.selenium.edge.EdgeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class GetTitleEx 
{
public static void main(String[] args) 
{
	EdgeDriver driver =new EdgeDriver();
	driver.get("https://www.flipkart.com/");
	
	String title = driver.getTitle();
     System.out.println(title);
     if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
     {
    	System.out.println("navigated successful");
     }
     else 
     System.out.println("nativagation failed");
	 
}

}
