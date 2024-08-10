package demo.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class ToLearnGetCurrentUrl 
{
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();// creating the object
	
	driver.get("https://www.instagram.com/");// navigate to the url
	 String url = driver.getCurrentUrl();// geeting the url 
	 System.out.println(url);// printing the url
	 if(url.equals("https://www.instagram.com/"))// validating the url 
		 System.out.println("user navigated successfully");
	 else
		 System.out.println("user failed to navigate");
	 
}
}
