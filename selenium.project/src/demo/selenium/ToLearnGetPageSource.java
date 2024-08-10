
package demo.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class ToLearnGetPageSource 
{
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		 String source = driver.getPageSource();
		 System.out.println(source);
	
	}
	
	
}
